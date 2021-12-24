-- yorumlama
select 4*5;
select 4*9+6;

-- bütün person nesnesini gelsin
select * from person;

--persondan sadece person_name gelsin
select person_name from person;

--persondan sadece person_surname person_name gelsin
select person_surname,person_name from person;

-------------------------------------- limit ---------------------------------
--persondan tc_limlik gelsin ve bunlardan sadece 4 tanesi gelsin
select * from person ;
select person.person_tc_number from person ;
select person_tc_number from person limit 4;

--eğer postgresql birden fazla database varsa şöyle yapıyoruz önce tabloAdi.özelliği
select person.person_tc_number from person limit 4;

-- alt alta yazabiliriz.
select
person.person_tc_number,
person_surname
from person limit 4;

---- alias : takma ad------------------------------------------------------
select
p.person_name as "adi", p.person_tc_number as "tc" from person as p ;

select * from person;
--select : kolon seçme
--from : tablo seçer

-- filter---------------------------------------------------------------------------------
-- where
--Adı Onur olan bütün listeyi dönder.
select * from person where person_name='Onur';

--Adı Onur olmayan bütün listeyi dönder.
select * from person where person_name!='Onur';

--Adı Onur olmayan sadece 2 tane listeyi dönder.
-- tek tırnak kullanıyoruz.
select * from person where person_name!='Onur' limit 2;

-- distinct: tekrarlı verileri kaldırır
-- personda person_name aynı isimde olanları sadece 1 kere yaz
select * from person as p;
select p1.person_name from person as p1;
select DISTINCT p1.person_name from person as p1;

-- persondaki adına göre sıralama yapsın
-- order by : sıralama yapıyor
-- default: asc
select * from person as p3 order by p3.person_id;
select p4.person_name from person as p4 order by p4.person_name;
select p3.person_name from person as p3 order by p3.person_name asc;
select p3.person_name from person as p3 order by p3.person_name desc;

-- persondaki elemanlarda son elemanı 1 tane liste olarak dönderelim ?
-- desc , limit
select * from person as p5 order by p5.person_id desc limit 1 ;

-- persondaki neslerde person_name Onur ve Görkem gelsin

-- where: AND=Ve OR=Veya
--ipucu: sql non case sensitive
-- SELECT , FROM , WHERE, ORDER BY, LIMIT
select *
FROM person as p6
where p6.person_name='Onur' OR p6.person_name='Görkem'
order by p6.person_surname asc limit 2;

--search: Person_name ilk M olanları liste olarak dönder
--like: içerden belirli elemaları getirtmek için kullanıyoruz
select * from person;
-- Select From where like
select * from person as p where p.person_name like 'M%';

--search: Person_name son n olanları liste olarak dönder
select p.person_name from person as p where p.person_name like '%n';

--search: Person_name başlasın: M sonu n olanları liste olarak dönder
select p.person_name from person as p where p.person_name like 'M%n';

-- personda person_name içeiğinde 'ağ' geçen bütün listeyi dönsün
select p.person_name from person as p where p.person_name like '%ağ%';

--personda person_name başlangıç kesinlikle "O" olacak sonu kesinlikle "r" olacak ve toplamda 4 karakter olacak
select p.person_name from person as p where p.person_name like 'O__r';