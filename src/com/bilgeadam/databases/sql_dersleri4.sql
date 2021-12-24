-- customers tablosuandaki compnayname A,B,D ile başlayanları listeleyelim
select c.companyname from customers as c;
select c.companyname from customers  c;
select c.companyname from customers as c 
where c.companyname like 'A%' OR 
 c.companyname like 'B%' OR 
 c.companyname like 'D%'; 
 
 -- customers tablosuandaki compnayname A,B,D ile başlayanları listeleyelim
 select c.companyname from customers as c where c.companyname similar to '(A|B|D)%';
 
 -- customers tablosuandaki compnayname A,B,D ile başla-mayanları listeleyelim
 select c.companyname from customers as c 
 where c.companyname not like 'A%' AND 
 c.companyname not like 'B%' AND 
 c.companyname  not like 'D%'; 
 
 
 
 -----------------------------------------------------------------------------------------------------------------------------------------
 --ascii
 select ASCII ('1');
 
 -----------------------------------------------------------------------------------------------------------------------------------------
 --concat
select CONCAT('Merhabalar ','Nasılsın');
--concat ayraç
select concat_ws(' + ','Merhabalar ','Nasılsın','Neredesin');

 -----------------------------------------------------------------------------------------------------------------------------------------
 --left substring
 select left('Merhaba',3);
 select substring('Merhaba',1,3);
 
 --right substring
 select right('Merhaba',3);
 select substring('Merhaba',5,8);
 
  -----------------------------------------------------------------------------------------------------------------------------------------
 -- sign: negatif pozitif mi ?  pozitif:+1 negatif:-1
 select  sign(44); --pozitif :+
 select  sign(-44);--negatif:-1
 
 
 
 -----------------------------------------------------------------------------------------------------------------------------------------
 --default--------
 --reflesh unutmuyıruzzzzzzz
 --constraints:
 -- Primary Key
 -- Not Null
 -- Foreign key
 -- unique
 -- 
 --default: eğer kullanıcı bir şey yazmazsa default olarak bizim belirdeiğimiz kelime veya sayı gelir.
 
 
 
  -----------------------------------------------------------------------------------------------------------------------------------------
 --subquery--------
 -- subQuery: ana mantığı manuel olarak yani elle yazdığımız yere subQuery gelecektir.
 -- subQuery: iç içe döngüler demektir.
 -- delete from prices where price_id=10
 select * from prices;
 --prices tablosundaki price en küçüğü bulan sql kodu
 select min(p.price) from prices p;
--prices tablosundaki price en küçüğü kime ait olduğunu bulalım
--manuel bulum
 select * from prices p where p.price=1000;
 --dinamik bulum
  select * from prices p where p.price = (select min(p.price) from prices p);
  
  --prices tablosundaki maaşı en yüksek olan Mehmetin maaşından 1000  eksiltelim.?
  -- update
  -- subQuery
  select * from prices p where p."name"='Mehmet';
  update prices set price=price-1000 where price_id=7
  update prices set price= (select max(prices.price) from prices  where prices."name"='Mehmet') -1000 where price_id=7
  
  update prices set price= (select max(prices.price) from prices  where prices."name"='Mehmet') -1000 where price_id=
  (select max(prices.price_id) from prices )
  
  --DML: insert , delete,update
  --DQL: select
  --DDL: create,truncate,drop,
  
  create database veritabani;
  drop veritabani;
  
  --constraint: Not null , Primary ,
  create table if not exists table5(
      id serial not null,
	  name varchar(155),
	  surname varchar(255),
	  number integer
	  PRIMARY key (id)
  );
  ON
 -----------------------------------------------------------------------------------------------------------------------------------------
 --index:bir tablomuz tablomuzda milyonlarca data var.
 -- name çok kullanıyorum. performans,hız,bellek : 10 (on) numara işimizi görüyor.
 --sürekli kullanıdğımız ve milyarlaca datadan veri select yapıyorsak bizim çözümümüz index 'tir'
 create database veritabani;
 create table if not exists table5();
 
 --CREATE INDEX index_adi on tabloAdi(kolonAdi);
 create index index_degisken on prices(name);
 select p."name" from prices p;
  
  -----------------------------------------------------------------------------------------------------------------------------------------
 --join:
 select * from region; --bölge         (1)
 select * from territories --bölgeler; (N)
 select * from territories ,region;
 -- Western ID:2
 select * from territories as t where t.regionid=2 --subQuery
  select * from territories as t where t.regionid=
  ( select  r.regionID  from region r where r.regiondescription='Western'  ) --subQuery
  
  --subQuery: Join yapacağını yapar ancak çok uzundur kodlar uzun kodlar sql performans eksikliğine sebebtir.
  
  --inner join: 2 tabloda ortak olan regionID eşleştirecek (map)
 select * from region; --bölge         (1)
 select * from territories order by regionid --bölgeler; (N)
 
 select * from territories ,region;
 --inner join syntax: 2 farklı tablodaki ortak verileri getirmek
 select * from territories t inner join region r on t.regionid = r.regionid where r.regiondescription='alan dışı';
 select * from territories t inner join region r on t.regionid = r.regionid where r.regiondescription!='alan dışı';
 
 -- 2 tablo üzerinden inner join
 -- 3 tablo üzerindenden inner join
   select t.territoryid,r.regiondescription from territories t inner join region r on t.regionid = r.regionid 
 
  select t.territoryid,r.regiondescription from territories t inner join region r on t.regionid = r.regionid 
  where r.regiondescription!='alan dışı' ;
 
   select t.territoryid,r.regiondescription from territories t inner join region r on t.regionid = r.regionid 
   where r.regiondescription like ('E%') ;
 
  select * from territories ,region;
 
 -- left join: iki tablodaki ortak olan dataları ve sol taraftaki tablonun bütün veri(data) listeler. 
  select * from territories t left join region r on  t.regionid = r.regionid;
  select * from region r left join territories t on  r.regionid = t.regionid;
  
   -- right join: iki tablodaki ortak olan dataları ve sol taraftaki tablonun bütün veri(data) listeler. 
  select * from territories t right join region r on t.regionid = r.regionid;
  select * from territories t right join region r on t.regionid = r.regionid;
  
   -- full join: iki tablodaki bütün  olan dataları ve sol taraftaki tablonun bütün veri(data) listeler. 
select * from territories t full join region r on t.regionid = r.regionid;


  -- cross join: iki tablodaki bütün  olan dataları kartezyen çarpımı yapıyor 
  select * from territories t cross join region r 
  

   
   
  -----------------------------------------------------------------------------------------------------------------------------------------
 --group by: aggregate min(),max(),avg(),count(),sum()
 --Tablomuzda grouplama işlemi yapıyoruz. 
 -- elimizde data ile anlamlı datalar elde ediyoruz.
  --suppliers tablosundaki country kaçar tane şehir adı var ?
   select s.country as sehir from suppliers s order by s.country asc;
   select s.country as "sehir adı" from suppliers s order by s.country asc;
   -- as: tek tırnak yazma select s.country as 'sehir' from suppliers s order by s.country asc;
   
   --country göre sıralama
   select  s.country,count(*) from  suppliers as s GROUP by s.country order by s.country;
   
   --countta küçükten büyüğe göre sıralama yapıyor
    select  s.country,count(*) from  suppliers as s GROUP by s.country order by count(s.country); 
	 select  s.country,count(*) from  suppliers as s GROUP by s.country order by count(s.country) asc; 
	 
	--countta büyükten küçüğe büyüğe göre sıralama yapıyor
	select  s.country,count(*) from  suppliers as s GROUP by s.country order by count(s.country) desc limit 5; 
	
	select * from orders;
	--orders tablosundaki shipvia'dan en küçüğü ?
	select min(o.shipvia) from orders as o;
	
	--orders tablosundaki shipvia'dan en büyüğü ?
	select max(o.shipvia) from orders as o;
	
	--orders tablosundaki shipvia'dan ortalama ?
	select avg(o.shipvia) from orders as o;
	
	--orders tablosundaki kolon adı shipvia'dan kaç tane olduğunu versin ?
	select o.shipvia,count(o.shipvia) from orders as o GROUP by o.shipvia order by o.shipvia; 
	
	--orders tablosundaki shipvia kaçtane olduğunu ve freight kolon toplamları ?
	select o.shipvia,count(o.shipvia) as shipvia , round(sum(o.freight))  as toplam from orders as o GROUP by o.shipvia order by o.shipvia; 
	
	--orders tablosundaki shipvia kaçtane olduğunu ve freight kolon yukarı yuvarlıyalım ? 
	--orders tablosundaki shipvia kaçtane olduğunu ve freight toplamları ve freight toplamları küçükten büyüğe sıralasın ?
	
	
	
	
	select * from orders o;
	select o.shipvia from orders o;
	select o.shipvia,count(o.shipvia) as shipvia  from orders o GROUP by o.shipvia;
	select o.shipvia,count(o.shipvia) as shipvia , round(sum(o.freight)) as toplam  from orders o GROUP by o.shipvia;
	
	-- 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
  -----------------------------------------------------------------------------------------------------------------------------------------
 --having: group by ile kullanılır. between like in:
  
  -----------------------------------------------------------------------------------------------------------------------------------------
 --check:
 
 -----------------------------------------------------------------------------------------------------------------------------------------
 --ERD:
  
 -----------------------------------------------------------------------------------------------------------------------------------------
 --view:
  
 -----------------------------------------------------------------------------------------------------------------------------------------
 --UML:
  
  
  
  
  
  
 -----------------------------------------------------------------------------------------------------------------------------------------
 --advanced
 -----------------------------------------------------------------------------------------------------------------------------------------
 --function
 -----------------------------------------------------------------------------------------------------------------------------------------
 --Trigger
 -----------------------------------------------------------------------------------------------------------------------------------------
 --procedure
 -----------------------------------------------------------------------------------------------------------------------------------------
 --transaction
 -----------------------------------------------------------------------------------------------------------------------------------------
 --for Jdbc Postgresql connection
  
 
 
 
 
 


 
 

 
 
 
 
 
 
 
 
 
 
 
 
 