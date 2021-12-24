--transaction:
-- ATM : kartı şifre:
-- +5000 TL
-- -1000 TL
-- +4000 TL
--ya hep ya hiç: bir işlem başlar ve tamamen sonuçlanırsa:
--transaction kullanağım bileşnler
-- select
-- delete
-- update
-- insert
-- create
-- drop
-- alter

--auto commit: begin ile commit olduğu duruma 
--begin : başlamak
--commit : bitirmek

--AI:
--select * from region;
--insert into region (regiondescription) values('deneme');


--begin;
	--çalışmasını istediğimiz kodlar buraya yazılacak
	--insert into region (regionid,regiondescription) values(29,'deneme26');
	--elektrik gitti
--commit;


select * from region;
delete from region where regionid=34;
delete from region where regionid=35;
delete from region where regionid=36;

--3 tane veri olsun bunlardan sadece 2 tanesi eklemek istiyoruz.
begin;
		insert into region (regionid,regiondescription) values(34,'deneme34');
		insert into region (regionid,regiondescription) values(35,'deneme35');
	SAVEPOINT birinci;
		insert into region (regionid,regiondescription) values(36,'deneme36');
	ROLLBACK TO birinci;
	
commit;
	select * from region;









