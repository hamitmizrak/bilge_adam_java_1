
-- lesson tablo oluşturalım.
-- property: 
-- _id, ==> AI , NN , PK
-- _name, NN
-- _type  default 1
-- _number, Check() ==> _number>0
-- _şimdiki tarihi default getirsin



--lesson tablsosundaki name kolona SP veya F(x) kullarak CRUD(Create: Read:select Update Delete);
--function
--procedure
--delete: son id göre 
--insert: region ekleme
--update son id göre
--select:lesson tablosundaki name kolonundaki bütün dataların sondan 3 karakterini getirelim

--DML: update,insert,delete
--DDL: create alter truncate drop
--DQL: select
--DCL: Revoke,deny

-- transaction
--databe create

create database  deneme44;
drop database  deneme44;

--
begin
create table if not exists lesson(
	_id serial not null,
	_name varchar(300) not null,
	_type smallint default 1,
	_number integer check(_number>0),
	_created timestamp with time zone default current_timestamp,
	primary key(_id)
)
commit;

--constraint: kısıtlayıcılar: AI,NN,Check(),default,PK


--DML
--select
select * from lesson;

--DML
--insert
insert into lesson (_name,_type,_number) values('adı',1,44);
--delete
select * from lesson order by _id desc;
delete from lesson  where _id=();
--update
update lesson set _name='adı2',_type='44',_number='55' where _id=(select max(_id) from lesson)

--cast('44' as INTEGER )

------------------------------------------------------------------------------------------------
--procedure delete template delete---------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--parametresiz procedure delete
create or replace procedure lesson_delete_parametresiz()
language plpgsql
as
$$
	begin
		delete from lesson where _id =(select max(_id) from lesson);
		commit;
	end;
$$;


select * from lesson order by _id desc;
call lesson_delete_parametresiz();


-------------------------------------------------------------------------------------------------
--procedure delete template delete---------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--parametreli procedure delete
--parametreli procedure delete
create or replace procedure lesson_delete_parametreli(_id1 integer)
language plpgsql
as
$$
	begin
		delete from lesson where _id =_id1;
		commit;
	end;
$$;


select * from lesson order by _id desc;
call lesson_delete_parametreli(7);


-------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--procedure insert template insert---------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--parametresiz procedure insert
create or replace procedure lesson_insert_parametresiz()
language plpgsql
as
$$
	begin
		insert into lesson (_name,_type,_number) values ('parametresiz name',12,55);
		commit;
	end;
$$;


select * from lesson order by _id desc;
call lesson_insert_parametresiz();

-------------------------------------------------------------------------------------------------
--parametreli procedure insert-----------------------------------------------------------------
create or replace procedure lesson_insert_parametreli(_name44 varchar, _type44 integer , _number44 integer)
language plpgsql
as
$$
	begin
		insert into lesson (_name,_type,_number) values (_name44,_type44,_number44);
		commit;
	end;
$$;


select * from lesson order by _id desc;
call lesson_insert_parametreli('insert parametreli',55,77);


-------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--procedure  template update---------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
--parametresiz procedure update
create or replace procedure lesson_update_parametresiz()
language plpgsql
as
$$
	begin
		update   lesson  set _name='parametresiz update',_type=55,_number=66 where _id=(select max(_id) from lesson);
		commit;
	end;
$$;


select * from lesson order by _id desc;
call lesson_update_parametresiz();

-------------------------------------------------------------------------------------------------
--parametreli procedure insert-----------------------------------------------------------------
create or replace procedure lesson_update_parametreli(_id44 integer, _name44 varchar, _type44 integer , _number44 integer)
language plpgsql
as
$$
	begin
		update lesson  set _name=_name44,_type=_type44,_number=_number44 where _id=_id44;
		commit;
	end;
$$;

select * from lesson order by _id desc;
call lesson_update_parametreli(6, 'update parametreli',55,77);


--select:lesson tablosundaki name kolonundaki bütün dataların sondan 3 karakterini getirelim
--function  template update---------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
-------------------- parametresiz
create or replace function lesson_function_parametresiz()
returns table (
adi44 varchar
)
language plpgsql
as
$$
	begin
		return query
		select  right(l._name,3)::varchar  from lesson l;
	end;
$$;

select lesson_function_parametresiz();











