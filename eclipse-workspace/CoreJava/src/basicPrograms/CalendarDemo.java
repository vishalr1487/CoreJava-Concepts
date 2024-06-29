package basicPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {

		
		Calendar cad= Calendar.getInstance();
		
		SimpleDateFormat sdf= new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(sdf.format(cad.getTime()));
		System.out.println(cad.get(Calendar.AM_PM));   /// for AM its 0 and for PM its 1 
		System.out.println(cad.get(Calendar.DAY_OF_MONTH));  
		System.out.println(cad.get(Calendar.DAY_OF_WEEK));
		System.out.println(cad.get(Calendar.DAY_OF_YEAR));
		System.out.println(cad.get(Calendar.MINUTE));
		

		
	}

}
