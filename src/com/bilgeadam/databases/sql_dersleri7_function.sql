--ön tanımlı: birşey yapmadan zaten var
--function yazdıktan sonra mutlaka reflesh yapalım.

-- aggregate function: ön tanımlı 
-- select min(regionid)  from region;
-- select max(regionid)  from region;
-- select avg(regionid)  from region;
-- select count(regionid)  from region;

--math function: ön tanımlı 

--function: kendi metotlarımızı yapalım.

--function		  : return
--declare         : String adi=""
--stored procedure: returnsuz
--trigger
--view

--sequence: belli şart altında kurallar bütünüdür.
--function: Javadaki metotlar: tekrarsız veriler için bir kere yaz her yerde kullan.

--function syntax;
-- DML:insert delete update
-- DQL:select
-- DDL:create drop alter

--create :oluşturmak 
--function: özel isim yani işlevsel bir yapı 
--topla: fonkisyon adi
--(): parametre
--parametresiz function😍 

--java 😃
--	public int topla(){
--		int sayi=1; --değişken tanımlama
--		int sayi2=2;
--		int sonuc;
--		sonuc=sayi1+sayi2;
--		return sonuc;
--	}

--return yazmak zorundayız
--parametresiz function
create function topla()
	returns integer --geri dönüş değeri
	language plpgsql --dili
	as
	$$ --dolar başla
		declare --değişken tanımlama
		sonuc integer;
		sayi1 integer=1;
		sayi2 integer=2;

		begin
			--kodlarımızı buraya yazıyoruz
			sonuc=sayi1+sayi2;
			return sonuc;
		end;
	$$; --
	
	--function çağırma
	select topla() as toplam;
	
	--function silmek
	drop function if exists topla;
	
	--topla2 adında parametresiz function oluşturalım. (25+25)
	--topla2 çağıralım(select)
	-- topla2 function silelim
	create function topla2()
		returns integer
		language plpgsql
		as
		$$
			declare
			sonuc integer;
			sayi1 int:=25;
			sayi2 int:=25;
			begin
				sonuc=sayi1+sayi2;
				return sonuc;
			end;
		$$;

select topla2();
drop function if exists topla2;

-----------------------------------------------------------------------------------------------------
--parametreli varchar function
create function metin( kelime varchar(100))
	returns varchar(100)
	language plpgsql
	as
	$$
		begin
			return kelime;
		end;
	$$;

select metin('Hamit Mızrak');

--parametreli varchar functionda verilen varcharın ilk 3 tanesini gösteren uygulama yapalım.
-- substring veya left

create function metin2(kelime varchar(200))
	returns varchar(100)
	language plpgsql
	as
	$$
		declare 
		yeni_degisken varchar(200);
			begin
			yeni_degisken=substring(kelime,1,3);
			  return yeni_degisken;
			end;

	$$;

select metin2('merhAbLAR');



-- function 3 tanedir ?
-- parametresiz
-- parametreli
-- table 
create function metin3( kelime varchar(250))
	returns varchar(250)
	language plpgsql
	as
	$$
		declare
		deger varchar(250);
		begin
			deger=substring(kelime,1,3);
			return deger;
		end;
	$$;

select metin3('istanbul');


-- Türkçe karakterleri değiştirine üğşçö ==>
-- Derece Fahrenhayt


-- function
-- genel bir tekrar.
-- having - group : Çağlayan Recep
-- group by anlamlı değerler oluşturmak
-- having: 
-- select * from tabloADi where kolonAdi group by kolon having 

-- Girilen kelimeyi hepsini küçük harf yapan fonksiyon yapalım ?
create or replace function kucukHarf(kelime varchar(250))
	returns varchar(250)
	language plpgsql
	as
	$$
		begin
			return lower(kelime);
		end;
	$$;
	select kucukharf('MALATya');

-- Girilen kelimeyi hepsini büyük harf yapan fonksiyon yapalım ?
create or replace function buyukHarf(kelime varchar(250))
	returns varchar(250)
	language plpgsql
	as
	$$
		begin
			return upper(kelime);
		end;
	$$;
	select buyukHarf('MALATya');

--template
  create or replace function TurkishToOTher(kelime varchar(255))
	returns varchar(255)
	language plpgsql
	as
	$$
		begin
			return  ;
		end;
	$$;
	

-- Türkçe üğşçöı ==> ugscoi ceviren fonksiyon ?
    create or replace function TurkishToOTher(kelime varchar(255))
	returns varchar(255)
	language plpgsql
	as
	$$
		begin
			return translate(kelime,'üğşçöı','ugscoi');
		end;
	$$;
select TurkishToOTher('çöığHamğü')


-- dereceyi Fahrenhayta çeviren fonksiyon ?
	--F=c*9/5+32
	--F=c*1.8+32
	--kelime varchar(255) , sayi integer , virgul float
	create or  replace function derToFahr(sayi integer)
	returns integer
	language plpgsql
	as
	$$
		begin
			return sayi*1.8+32;
		end;
	
	$$;
	
	select derToFahr(15);
	
					
-- girilen 3 sayının ortalaması alan fonksiyon ?
create or  replace function ortalama(sayi1 integer,sayi2 integer,sayi3 integer)
	returns integer
	language plpgsql
	as
	$$
		begin
			return (sayi1+sayi2+sayi3)/3;
		end;
	
	$$;
	
	select ortalama(1,2,3) as ortalama;


-- daire hesabı: Pi*r*r

create or  replace function daire_alanFloat(yaricap float)
	returns float
	language plpgsql
	as
	$$
		begin
			return (yaricap*yaricap*3.14);
		end;
	
	$$;
	
	select daire_alanFloat(3) as "dairede alan";
--------------------------------------------------------------
create or  replace function daire_alanInteger(yaricap float)
	returns float
	language plpgsql
	as
	$$
		begin
			return cast((yaricap*yaricap*3.14) as INTEGER) ;
		end;
	
	$$;
	
	select daire_alanInteger(3) as "dairede alan";
-----------------------------------------------------------------------
--function
--1-) parametresiz.
create function function_adi1()
	returns integer
	language plpgsql
	as
	$$
		declare
		sayi integer=5;
		begin
			return 5*5;
		end;
	$$;


--2-) parametreli.
create function function_adi2(yaricap float)
	returns float
	language plpgsql
	as
	$$
		declare
		sayi float;
		begin
		sayi=yaricap;
			return sayi*sayi+5;
		end;
	$$;

--3-) Var olan tablolar üzerinden işlemler yapacağız.


create function function_adi3(search varchar)
	returns table 
	(
	--table takma olacak
		name44 varchar
	)
	language plpgsql
	as
	$$
		begin
			Return Query
			select  name from prices where name like search;
		end;
	$$;

select function_adi3('%1');

-- like  a%  %b  %as%
select * from prices where name like '%1' ;


--prices tablosundaki surname listeyelim ?

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
		select name, surname from prices;
end;
$$;


select get_film();





