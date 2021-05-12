package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat formateur = new SimpleDateFormat("/dd/MMMMM/yyyy", Locale.FRANCE);
		System.out.println(formateur.format(d));
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.MONTH,04 );
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		
		Date date1 = cal.getTime();
		
	
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 2016);
		cal1.set(Calendar.MONTH,04 );
		cal1.set(Calendar.DAY_OF_MONTH,19);
		cal1.set(Calendar.HOUR, 11);
		cal1.set(Calendar.MINUTE, 59);
		cal1.set(Calendar.SECOND, 30);
		Date date2 = cal1.getTime();
		
		SimpleDateFormat formateur1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss", Locale.US);
		System.out.println(formateur1.format(date2));
		
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MMMMM/dd/EEEEE hh:mm:ss", Locale.CHINA);
		System.out.println(formateur2.format(date2));
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MMMMM/dd/EEEEE hh:mm:ss", Locale.FRANCE);
		System.out.println(formateur3.format(date2));
		
		SimpleDateFormat formateur4 = new SimpleDateFormat("yyyy/MMMMM/dd/EEEEE hh:mm:ss", Locale.GERMAN);
		System.out.println(formateur4.format(date2));
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("yyyy/MMMMM/dd/EEEEE hh:mm:ss", new Locale("ru"));
		System.out.println(formateur5.format(date2));
	}

}
