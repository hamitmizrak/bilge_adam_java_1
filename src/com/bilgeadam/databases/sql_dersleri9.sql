select * from student;
select * from student where student.gender=1
--student tablosundaki istanbuldaki erkeklerden kaç tane vardır?
select s.county,count(*) as "erkek sayısı" from student as s where s.gender=1 group by s.county having s.county='istanbul';

--student tablosundaki istanbuldaki erkeklerden kaç tane vardır bulunan erkeklerin isimleri
select s2.student_name,(select count(*) as "erkek sayısı" from student as s where s.gender=1 and s.student_name=s2.student_name group by s.county having s.county='istanbul') from student as s2 where s2.gender=1 and s2.county='istanbul' 
select s.student_name, s.county,count(*) as "erkek sayısı" from student as s where s.gender=1 
group by s.county,s.student_name
having s.county='istanbul'


--student tablosundaki istanbuldaki bayanlardan kaç tane vardır?
select s.county,count(*) as "bayan sayısı" from student as s where s.gender=0 group by s.county having s.county='istanbul';


--------------------------------------------------------------------------------------------------------------
--raice notice template
Raise Notice '';
--------------------------------------------------------------------------------------------------------------

--function template 2 tane tam sayının toplamı 
create or replace function function_1(sayi1 integer,sayi2 integer)
returns integer
language plpgsql
as
	$$
		declare
			toplam integer;
		begin
			toplam=sayi1*sayi2;
			return toplam;
		end;
	$$;

select function_1(2,4) as "sonucu";

select * from student  order by student_id desc

create or replace function function_insert(kelime varchar)
returns varchar
language plpgsql
as
	$$
		declare
			sorgu varchar;
		begin
			insert into student (student_name) values(kelime);
			delete from student where student_id=18;
			sorgu=(select student_name from student  order by student_id desc);
			return sorgu;
		end;
	$$;

select function_insert('dene44') as "sonucu";





--------------------------------------------------------------------------------------------------------------
--declare Template
do
	$$
		declare
			sayi1 int=15;
			sayi2 int=25;
		begin
			raise notice 'sayi1 %', sayi1;
			raise notice 'sayi2 %', sayi2;
		end;
	$$;
	
--	declare static data
do	
	$$
	declare
		sayi1 integer=12;
		sayi2 integer=2;
		carpim integer;
	
	begin
		carpim=sayi1*sayi2;
		raise notice 'carpım sonucu %',carpim;
	end;
	
	$$;
	
--	declare tablo üzerinden çalışıyoruz.
do	
	$$
		declare
			rowsCount integer;
		begin
			rowsCount=(select count(*) from prices);
			raise notice 'prices toplam satır sayısı sonucu %',rowsCount;
		end;
	$$;	
	

--	declare if / else : vizeNotu*0.4 ,FinalNotu*0.6  sonuc>=60 geçti değilse kaldı
do
	$$
		declare
			vizeNotu float:=60;
			finalNotu float:=60;
			sonuc float;
		begin
			sonuc=(vizeNotu*0.4+finalNotu*0.6);
			--if else
			if (sonuc>=60) then
				Raise Notice 'notunuz: % geçtiniz ',sonuc;
			else
				Raise Notice 'notunuz: % kaldınız ',sonuc;
			end if;
		end;
	$$;

-- if else if
do $$
declare
v_film film%rowtype;
len_description varchar(100);
begin

select * from filminto v_film where film_id = 100;
	if not found then
		raise notice 'Film not found';
	else
		if v_film.length >0 and v_film.length <= 50 then
			len_description := 'Short';
		elsif v_film.length > 50 and v_film.length < 120 then
			len_description := 'Medium';
		elsif v_film.length > 120 then
			len_description := 'Long';
		else
			len_description := 'N/A';
		end if;
		raise notice 'The % film is %.',
		v_film.title,
		len_description;
	end if;
end $$

--	declare if / else : sayının tek mi çift mi?
do
	$$
		declare
			sayi integer:=16;
		begin
			--if else
			if (sayi % 2=0) then
				Raise Notice 'sayınız: % çift sayı ',sayi;
			else
				Raise Notice 'sayınız: % tek sayı ',sayi;
			end if;
		end;
	$$;

select * from student;
--case : if elseif else
select s.student_name, s.final_notes,
case
	when s.final_notes=60
		then 'final notu 60 '
	when s.final_notes=70
		then 'final notu 70 '
	else 'diğer notlarınız'
end duration

from student as s

--final sonu: 60 üstündekiler 60 üstündedir yoksa altındadır
select s.student_name, s.final_notes,
case
	when s.final_notes>=60
		then 'üstünde '
	
	else 'altında'
end duration
from student as s


--while
-- int a=1;
-- while(a<10){
-- sout(a);
-- a++;
-- }
-- student tanlosundaki
--verilen döngüdeki sayılarıın toplamını yapalım.
do
	$$
		declare
			sayac int=1; --başlangıç değer

		begin
			while sayac<=10 --şartın 
				loop
					Raise Notice 'Sayaç. % ',sayac;
					sayac=sayac+1; --sayaç artır

				end loop;
		end;
	$$;
	
-- sayı toplamları

do
	$$
		declare
			sayac int :=0;
			toplam int=0;
		begin
			while sayac<10
				loop
					sayac=sayac+1;
					toplam=toplam+sayac;
				end loop;
				Raise Notice 'toplam: %',toplam;
		end;
	$$;
	
	-------------------------------------------------------
	-- 1-10 arasındaki sayılardan tek olanları tek versin çift olanları çift desin
	-- while if-else
do
	$$
		declare
			sayac int=1; --başlangıç değer
		begin
			while sayac<10 --şartın 
				loop
					Raise Notice 'Sayaç. % ',sayac;
						sayac=sayac+1; --sayaç artır
					if (sayac % 2=0) then
						Raise Notice 'sayınız: % çift sayı ',sayac;
					else
						Raise Notice 'sayınız: % tek sayı ',sayac;
					end if;
				end loop;
		end;
	$$;
	
	--student tablosundaki surname'in null olanlarını soyadını girmediniz ile değiştirelim.
	-- is null
	--update student set 
	
	select student_surname from student order by student_id;
	
	--Null Pointer Exception: hataların babası
	`databaseAdi`.`tabloadı`.`kolonadı`
	update student set  student_surname ='soyadınız girmediniz' where student_surname is  null;
	
	-- sleep: programımızı çalıştırken belli saniyelerde bekleyerek çalışsın
	-- benim yazmış olduğum select sorgusu 10 saniye sonra çalıssın.
	select 4+4;
	select pg_sleep(10);
	select * from student,pg_sleep(3);
	
	
---------------------------------------------------------------------------------------------------------------

--function template 2 tane tam sayının toplamı 
create or replace function function_1(sayi1 integer,sayi2 integer)
returns integer
language plpgsql
as
	$$
		declare
			toplam integer;
		begin
			toplam=sayi1*sayi2;
			return toplam;
		end;
	$$;

select function_1(2,4) as "sonucu";


---------------------------------------------------------------------------------------------------------------
select * from  getFunction('%a',2021);
call getProcedure('%a',2021);

--stored procedure
--function         : return    ==> String,int,Integer
--stored procedure : returnsuz ==> javada void'e benziyor

create or replace procedure procedure_name()
language plpgsql
as
	$$
		begin
		    --kodlarımız yazıyoruz.
			Raise Notice 'Ben bir procedurüm';	
		end;
	$$;
	
-- procedure çağır
call procedure_name();


-- orders tablosundali shipname sonu s ile biten listeyi procedure ==> order_shipname_like olarak yazalım ?
select * from orders;

create or replace function order_shipname_like(_search varchar)
returns table ( _name varchar )
language plpgsql
as
	$$
		begin
		return query
			select o.shipname from orders o where o.shipname like (_search);
		end;
	$$;

select  count(*) from order_shipname_like('%s');

--parametreli SP
select * from student order by student_id;

update student
set student_name='adınız girilmedi',student_middle='ikinci adınızı girmediniz' 
where student_id=14

select * from student order by student_id;

create or replace procedure student_update(adi varchar,ikinci_ad varchar,id integer)
language plpgsql
as
	$$
		begin
			update student set student_name=adi,student_middle=ikinci_ad where student_id=id;
			commit;
		end;
	$$;

select * from student where student_id=14; 
call student_data('ad55','ikinci ad55',14);

--student tablsosundaki 1 numaralı kayıtı stored procedure olarak yazalım.
create or replace procedure student_delete(id integer)
language plpgsql
as
	$$
		begin
			delete from  student  where student_id=id;
			commit;
		end;
	$$;

select * from student order by student_id;
call student_delete(2);

--student_delete
--student_update
--student_insert
--student_Select

CREATE OR REPLACE FUNCTION student_Select()
RETURNS SETOF student 
language plpgsql
AS 
$$
	BEGIN
	  RETURN QUERY SELECT * FROM student;
	END
$$;

SELECT * FROM student_Select();


CREATE OR REPLACE FUNCTION student_like()
RETURNS SETOF student 
language plpgsql
AS 
$$
	BEGIN
	  RETURN QUERY SELECT * FROM student where student_middle like '%l';
	END
$$;

SELECT * FROM student_Select();



 --student tablsosundaki 1 numaralı kayıtı stored procedure olarak yazalım.
create or replace procedure student_select()
language plpgsql
as
	$$
		begin
			delete from  student  where student_id=id;
			commit;
		end;
	$$;

select * from student order by student_id;
call student_delete(2);




--
create or replace function get_film () 
	returns table 
	(
		name44 varchar,
		surname44 varchar
	) 
	language plpgsql
as $$
begin
	return query 
		select * from prices;
end;
$$;


select get_film();


select * from region;
--lesson tablo oluşturalım.
--property: 
-- id, ==> serial NN PK
-- _name, NN
-- _type ,
-- _number, Check() ==> _number<0
-- _şimdiki tarihi default getirsin


--lesson tablsosundaki name kolona SP veya F(x) kullarak CRUD(Create: Read:select Update Delete);
--function
--procedure
--delete: son id göre 
--insert: region ekleme
--update son id göre
--select:lesson tablosundaki name kolonundaki bütün dataların sondan 3 karakterini getirelim







--region tablosuna _insert , _delete , _update
--DML: SP
--insert delete update

--DQL: f(x) region tablosundaki regiondescription kolonundaki bütün dataların sondan 3 karakterini getirelim






















