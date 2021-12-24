--lock: kilitleme



--
begin;
LOCK TABLE prices IN ACCESS EXCLUSIVE MODE;
--

--data
--database
--Database MAnagement System
--sql RDBMS:postgres,Mysql,Mssql 
--veri tabanı türler,inde ilişkisel veri tabanı 
--1987 ANSI
--DML:insert,delete,update
--DDL:create,drop,alter
--DQL:select
--DCL:Data Control Language: Deny,Revoke,Grant

create database veri_tabani;
create table tabloAdi(
idim serial NOT NULL,
	adi varchar(255),
	PRIMARY KEY(idim);
)
--where: BİL : between 10 and 100  in:subQuery  like:

select distinct name from tabloAdi as "takma adı" where sutunAdi group by id having avg(yas)>2500 order by name asc limit 5

insert into prices (name) values('asd')
delete from prices where id=4;
update tablo_adi set adi='asdasd' where id=5
--Ctrl+Space

--operatörler
=
<>
>
>=
<
<=

--where: between in like
-- is null
-- is not null

--cast
cast('44' as INTEGER)
cast('44' as DOUBLE)
cast('44' as DATE)

--Math
select abs(-44)
select pow(2,5)
select sqrt(16)
select sin(45)
select ceil(4.5)
select floor(4.5)
select round(4.5)
select random()*4+1


--string
select upper(asd)
select lower(asd)
select length(asd)
select ltrim( asd)
select rtrim(asd )
select replace(kolonAdi,'a','e')
select substring(kolonadi,1,3)
select repeat(kolonadi,3)
select concat(kolonadi,'asdas')

--
selectb * from prices where id=(select min(id) from prices);

--hayali kolonlar
select (adi+4) as adi

--aggreagte
sum()
avg()
min()
max()
count()

select t1.name,t2.surname from tablo1 as t1 inner join tablo2 as t2 on t1.id=t2.id

--postgresq non case sensitive
--tek tırnak
--çift tırnak as 
truncate tablo1
restart identity;
select 4*4

-- tek
/*çoklu satır */


--time stamp


create table tabloAdi(
idim serial NOT NULL,
	adi varchar(255),
	created timestamp with time zone default current_timestamp ,
	fiyat integer check(id>0)
	PRIMARY KEY(idim);
)

--integer float 
--varchar character varying

--tekrasızı
select * from prices
union
select from prices2;

--tekrarlı veya tekrarsız
select * from prices
union all
select from prices2;


--index
create index index_id on tabloAdi(kolonAdi);

--view
create view hayaliTablolar
AS
select * from prices;

select * from hayaliTablolar;
drop view hayaliTablolar;

--declare
--stored procedure
--trigger


