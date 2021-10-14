package com.bilgeadam.a012.date.person2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
// import java.sql.sql;

public class DateExamples {
	
	public static void main(String[] args) {
		// epoch time çağ zamanı:1 ocak 1970
		// long epochTime = System.currentTimeMillis();
		// System.out.println(epochTime);
		
		// System.out.println();
		
		// Date: aylarda Sıfırda başlar ,
		// Date date = new Date(epochTime);
		// System.out.println(date);
		
		// 1900 tabanlıdır +1900 -1900
		// Depracated(Amerikanlılar kullanır).
		// java geriye uyumlulukta bir sıkıntı yoktur. backwards compability
		
		// +1900 -1900
		// 2021-1900=121
		// Date date2 = new Date();
		// System.out.println(date2);
		
		// gregorian calendar(Miladi takvim)
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyy", locale);
		
		Date date = new Date();
		
		String str = simpleDateFormat.format(date);
		System.out.println(str);
		System.out.println(Integer.parseInt(str));
		
	}
}
