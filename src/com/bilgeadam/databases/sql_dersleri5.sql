
--student tablosundaerkekler listeleyelim ?
select * from student as s where s.gender=1;

--1
--student tablosunda istanbuldaki erkeklerden kaç tane var ?
select s.county,count(*) as "erkek" from student as s where s.gender=1 and s.county='istanbul'  group by s.county

--student tablosunda istanbuldaki erkeklerden kaç tane var  ve isimleri
select s.student_name, s.county,count(*) as "erkek" from student as s where s.gender=1   group by s.county, s.student_name having s.county='istanbul'


--2
--student tablosunda istanbuldaki şehirlerdeki bayan yaş ortalaması
select avg(s.county) from student as s group by s.county


--student tablosundabayanları lsiteleyeim ?
select * from student as s where s.gender=0


--student litesinde toplam kaç kayıt vardır ?
select count(*) as "kayıt sayısı" from student as s 

--student tablosunda kaç tane erkek var ?
select s.student_name,  count(*) from student as s where s.gender=1 group by s.student_name;

--student tablosunda şehirlerden kaçar tane var ?
select s.county,count(*) from student as s group by s.county


--Alt+S: kısayol kaydetme tuşu

-------------------------------------------------------------------------------------------------------

-- advanced sql
--postgres sürümünü bulmak
select version();

--postgres kullanıcıları listele
select usename from pg_user; 

--postgres kullanıcı ekle
create user deneme;

-- PID  KILL 
select * from pg_stat_activity
select * from pg_stat_activity where state='active';

-- pid sayısı:23672
--select pg_cancel_backend(23672);
--select pg_terminate_backend(23672);

-- ps tabloları listelemek
SELECT *
FROM pg_catalog.pg_tables
WHERE schemaname != 'pg_catalog' AND 
    schemaname != 'information_schema';

-- ps tabloları kaç tane tablo var
SELECT  count(*)
FROM pg_catalog.pg_tables
WHERE schemaname != 'pg_catalog' AND 
    schemaname != 'information_schema';
