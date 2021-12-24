-- student tablosunun verilerini listeleyelim. 
select * from student as s;

-- student vize notları listeleyelim.
select s.vize_notes from student as s;

-- student final notları listeleyelim.
select s.final_notes as finalNotu from student as s;

-- student tablosundaki student_name columnsin sonu 2 ile biten listeleyim
select s.student_name from student as s where s.student_name like '%2';

--1. student tablosundaki vize_notunun %40  + final notunun %60 hesaplayan ve sonuc diye bir kolun oluşturalım
select s.vize_notes*0.4+s.final_notes*0.6 as sonuc  from  student as s;

--aggregate function
--1. adımdan çıkan sonuclarından en büyüğünü alias:enbuyuk bulalım
select  max( s.vize_notes*0.4+s.final_notes*0.6) as enBuyuk  from  student as s;

--1. adımdan çıkan sonuclarından en küçüğü alias:enKucuk bulalım
select  min( s.vize_notes*0.4+s.final_notes*0.6) as enKucuk  from  student as s;

--1. adımdan çıkan sonuclarından toplamları alias:toplam bulalım
select  sum( s.vize_notes*0.4+s.final_notes*0.6) as toplam  from  student as s;

--1. adımdan çıkan sonuclarından ortalaması alias:ortalama bulalım
select  avg( s.vize_notes*0.4+s.final_notes*0.6) as ortalama  from  student as s;

--1. adımdan çıkan sonuclarından toplam kaç adet vardır alias:sayi bulalım
select  count( s.vize_notes*0.4+s.final_notes*0.6) as sayi  from  student as s;



select * from prices as p;
delete from prices where prices.price_id=38;
insert into prices (price,counter) values(44,25);

--DDL: truncate
TRUNCATE table prices
RESTART IDENTITY;

--DDL: create database
create DATABASE silinecek;

--ERD UML
--DDL: create table

--kolonADi dataTypes default constraints
-- if not exists  anlamı böyle bir tablo varsa oluşturma
create table if not exists yeni_tablo (
	person_id serial NOT NULL,
	person_name varchar(251),
	person_surname varchar(155),
	serial_number integer,
	PRIMARY KEY (person_id)
);

--DDL: table alter
alter table yeni_tablo
add created_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP;

select * from yeni_tablo;

-- DDL: table drop
drop table yeni_tablo;


--DDL: drop database
drop DATABASE silinecek;

--DDL:drop table
drop TABLE deneee;


--data types: metinsel ==> character=static character varying =dinamik(kapladığı alan kadar yer kaplar) < text=sınırsız büyüklükte 
--data types: sayısal  ==> smallint < integer < biginteger
--data types: tarihsel ==> Date , timestamp 

select CURRENT_TIME; //saat dakika saniye 
select CURRENT_DATE; //yıl-ay-gün
select CURRENT_TIMESTAMP; //yıl-ay-gün-saat-dakika-saniye

select age('2021-10-26','1990-10-10');

--	constraint=kısıtlayıcılar
--	1-) NOT NULL: boş geçilemez
--	2-) unique (UN) : eşsizdir.      istediğimiz kadar ekleriz.  NotNull olmak zorunda değildir..
--	3-) primary key (PK): eşsizdir.  1 tanedir. NotNull olmaz zorundadır.
--	4-) Foreign Key(FK): yabancıl anahtar: başakasının primary keydir.
--	5-) check 
--	5-) Super Key=PK+colomns ==> id+name
create table if not exists kisitlayilar(
	id serial NOT NULL, --PK
	name text not null,
	email char(55) not null UNIQUE, --UN
	tc_kimlik char(55)  UNIQUE,
	person_id integer REFERENCES yeni_tablo(id) --FK
	PRIMARY KEY(id); --PK

);

create table if not exists yeni_tablo (
	person_id serial NOT NULL,
	
-- syntax sıralaması: subQuery
	select + from + join + where (like+between+in (subQuery) )+ group by:gruplama + Having:filte + order by id +limit 
	
	--union : farklı tabloları birleştirir.
	--union:altın +gümüş : 2 farklı tablomuzu =tek bir satırda göstermeye denir.
	--union: data type sırası ve sayısı aynı olacak yoksa null verir birleştirmez
	select * from tablo1
	union
	select * from tablo2
	
	select c.city,c.address  from customers as c
	union
	select s.city,s.address   from suppliers as s 
	
	-- customer tablosundaki fax ile suppliers tablosundaki fax bir tablo olarak gösterelim.
	--tablolardaki farklı kayıtları getiri aynı kayıtları distinct gibi yani farklı olanları getirir
	select c.fax from customers as c union select s.fax from suppliers as s
	
	-- tablolarım
	-- adı: hamit  hamit  Hamit  sayı  1-1-1
	-- adı: mızrak mızrak Mızrak sayı: 1-1-3
	select * from union1;  
	select * from union2;  
	--hamit Hamit mızrak Mızrak
	
	-- virgülleyerek farklı tabloları ekleme işlemek 
	select * from union1 ,union2
	--union: yıldız(*) ekleyebilmem için iki tablonun kolon sayısı,kolon türleri aynı olacak
	select  * from union1 as u1
	union
	select  * from union2 as u2
	--union1 id adi sayi
	
	
	select  u1.sayi1 from union1 as u1
	union
	select  u2.sayi2 from union2 as u2
	
	select * from union1,union2;
	
	
	--join
	-- PK:1.anahtar ile FK:2.anahtar arasındak bağlantı kurmaktır.
	--1-1
	--1-N
	--N-1
	--N-M (ara tablo olmak zorunda)
	
--syntax: on
select * from yazar inner join kitap on yazar.yazar_id = kitap.yazar_id;
select * from kitap inner join yazar on yazar.yazar_id = kitap.yazar_id;
	
--alias kullanalım
select * from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;
	
	--bütün kitapları listeleyelim
--select k.kitap_adi from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;

	--yazar adı kitap
	select y.yazar_adi, k.kitap_adi from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;
	
	select lower( y.yazar_adi) as isim, upper(k.kitap_adi ) as kitap from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;
	
	--yazarID yazaradı yazarsoyadı yazar kitabı
	select  k.yazar_id, y.yazar_adi ,y.yazar_soyadi,k.kitap_adi from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;
	
	--kitap adının ilk 4 karakterini listeleyim
	select lower(SUBSTRING(k.kitap_adi ,1,4))   as kısaltmasi from kitap as k inner join yazar as y on y.yazar_id = k.yazar_id;
	
	--kitap adının ilk 4 karakterini listeleyim hepsi küçük harfle gelsin
	
	--Nortwind databasesinde customers tablosundaki  company name A ile başlayanları listeyelim
	select c.companyname from customers as c  where c.companyname like('A%');
	
	-- Nortwind databasesinde customers tablosundaki  company name A B D ile başlayanları listeyelim
	select c.companyname from customers as c ;
	select c.companyname from customers as c where c.companyname like 'A%' OR c.companyname like 'B%' OR c.companyname like 'D%'
	select c.companyname from customers as c where c.companyname not like 'A%' and c.companyname not like 'B%' and c.companyname not like 'D%'
	
	set @adi='Hamit';
	
	
	select COALESCE
	
	
	
	
	



