--tek satır
/* çok satır */

--Bütün customers listesi gösterin
select * from customers;

--Customers tablosunda  region sutunu listeyelim
select region from customers;

-- customers tablosunu alias c belirleyelim ve sonrasında sadece region getirelim
select c.region from customers as c;

--sıfır null
--customers tablosundaki region cols null değerlerini listeyin
select c.region from customers as c where c.region is null ;

-- DBMS: postgres Mysql Mssql mariadb h2db 
--customers tablosundaki region cols null olmayan değerlerini listeyin
select c.region from customers as c where c.region is NOT null ;



--CUSTOMERS tablosundaki city listelim
select c.city from customers as c;

--CUSTOMERS tablosundaki city  "Berlin" olan listeleri getirelim
select c.city from customers  as c where c.city='Berlin';

--where: BİL  like in between
--Customers tablosundaki contactname A ile başlayan dataları listeleyelim ?
select c.contactname from customers as c where c.contactname like 'A%';

--Customers tablosundaki contactname r ile biten dataları listeleyelim ?
select c.contactname from customers as c where c.contactname like '%r';

--Customers tablosundaki contactname içinde 'an' geçen bütün dataları listeleyelim ?
select c.contactname from customers as c where c.contactname like '%anna%';

-- prices tablosundaki 100 ile 500 arasındaki verileriş listeleyim ?
-- where: BİL => like  between 
select * from prices as p where p.price BETWEEN 100 and 500;
select * from prices as p where p.price>=100 and p.price<=500;
select * from prices as p where p.price>100 and p.price<500;



--customers tablosundaki cityde London ve Bern şehirlerini listelelim ?
select * from customers as c where c.city='London' or c.city='Bern' ;
select * from customers as c where c.city in('London','Bern');

-- where BİL ==> 
-- between: arasındaki değer 
-- in: tablodaki sutunlardaki verileri çağırmak  ve subquery için kullanıyoruz.
-- like: ayıklamak
-- DML insert delete update
select * from customers;
select c.companyname,c.contacttitle from customers as c; 
 

--DML
--insert
--update
--delete

--DQL
--Select
--prices tablosuna veri ekleyeceğim
--insert into tabloAdi(kolonIsimleri) values('');
insert into prices(price) VALUES ('1200');

--prices tablosuna 1100 ekliyelim

select * from prices;

--counter null olan değerler

--insert
--prices tablosuna  price: 1500 counter:9  ekliyelim
insert into  prices(counter,price) VALUES (10,1600);

--delete
delete from prices as p  where  p.price_id=31;

--insert select delete
-- prices tablosuna  price:500 counter:90 ekleyelim ekranda gösterelim ve sonra bu eklediğimiz tekrar silelim

--CRUD: create read update delete
--ekleme
insert into prices (price,counter) values(500,90);

--select
select * from prices ;

--delete
delete from prices as p1 where p1.price_id=27;

--update
update prices  set price=950;
update prices  set price=770  where prices.price_id=33;
update prices  set price=770 ,counter=77 where prices.price_id=33;

--prices tablosuna price:880 ekliyelim counter:88 ekleyelim.
insert into prices (price) VALUES(880);

--prices görüntüleyelim
select * from prices;

--prices tablosunda en eklediğimize güncelleme olarak price:990 counter:90 yapalım
update prices set price=990 where price_id=34

--prices görüntüleyelim
select * from prices;

--prices en son kayıtı silelim.
delete from prices where prices.price_id=34

--prices görüntüleyelim
select * from prices;

-- select count(*) from products;
-- select sum(productid) from products ;
-- select sum(productid) as toplam from products where productid BETWEEN 18 and 19 ;
-- select min(productid) from products;
-- select max(productid) from products;
-- select avg(productid) from products;

-- select * from products;
-- select upper(productname) from products;
-- select lower(productname) from products;
-- select length(productname) from products;
-- select ltrim(productname) from products;
-- select rtrim(productname) from products;
-- select  substring(productname,1,3) from products;
-- select  replace(productname,'a','x') from products;
-- select  concat(productname,'son') from products;
-- select reverse(productname) from products;
-- select repeat(productname,2) from products;

--cascade
------------aggregate----------------------------------------------------------------------------
--aggreagate function :
select * from products;

select p.productid from products as p  ;

-- minumum değer verir
select min(p.productid ) as minumum from products as p ;

--max değer verir
select max(p.productid ) as maksimum from products as p ;

--toplam değer
select sum(p.productid ) as toplam from products as p ;

--ortalama değer
select avg(p.productid ) as ortalama from products as p ;

--eleman sayısını veriyor
select count(*) as maksimum from products;

--string function
select * from orders;
-- as ==> alias

--orders tablosundaki orderid'nin
select o.orderid from orders as o;

--1-)en küçük sayıyı bulalım
select  min(o.orderid) as min from orders as o;
 
--2-)en büyük sayıyı bulalılım
select  max(o.orderid) as max  from orders as o;

--3-)toplamlarını bulalım
select  sum(o.orderid) as topla  from orders as o;

--4-)ortalaması bulalım
select  avg(o.orderid) as topla  from orders as o;

--5-)toplam kayıt sayısını bulalım
select  count(*) as sayı  from orders as o;


select * from prices;
--7-) prices tablosunda price:69 counter:11 ekleme yapalım son id dinamik olarak silelim
insert into prices (price,counter) values (69,11);
select * from prices;

--delete from prices where price_id=36
delete from prices where price_id IN ( 31);
delete from prices where price_id IN ( select max(price_id) from prices);

--subQuery: iç içe sorgular : IN kullanıyoruz.
select * from categories;

--ortalama: 


---------- string ----------------------------------------------------------------------------
select c.categoryname from categories as c;

--upperCase: Bütün karakterli büyük harf  yapıyor.
select upper(c.categoryname)   from categories as c;

--lowercase: Bütün karakterli büyük harf  yapıyor.
select lower(c.categoryname)   from categories as c;

--length: Bütün rowsların eleman sayısını verir
select length(c.categoryname) as elemanSayisi   from categories as c;

--trim: sol tarafındaki boşluğu almak iin kullanıyoruz.
select ltrim(c.categoryname) as elemanSayisi   from categories as c; 
select ltrim(c.categoryname) as "eleman Sayisi"   from categories as c; 

--substring: parçalama
select substring(c.categoryname,1,3 ) as parcala   from categories as c; 
 
 select c.categoryname from categories as c;

--replace: değiştirmek
select replace( c.categoryname,'e','X'  ) as degistir   from categories as c; 

--repeat: tekrar sayısı
select repeat (c.categoryname,5) as degistir   from categories as c; 

-- leght(trim())

--cast
select CAST ('5' AS INTEGER);
SELECT CAST ('2015-12-01' AS DATE);
CAST ('10.5' AS DOUBLE);
select '12'+5;
select 12+5;
select power(2,'5');

select CAST('6' as INTEGER)

--Math
select pi();--pi sayısı
select abs(-44); --mutlak değer
select sqrt(16); --karekök

select power(2,5); -- üslü sayı
select pow(2,5); -- üslü sayı
select pow('2',5); -- üslü sayı
select pow('2','5'); -- üslü sayı
select sin(45); --sin
select random()*2+1; --rastgele sayılar üretmek
select round(4.51); --üste alta yuvarlama
select floor(4.9); --alta yuvarlama
select ceil(4.9);--üste yuvarlama
select round(random()*99+1); --iki fonksiyonu beraber kullandık

-- subQuery
-- Join
-- örnekler


































