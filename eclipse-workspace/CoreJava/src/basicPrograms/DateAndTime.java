package basicPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {

		// To print the current date and time 
		
		Date d= new Date();
		System.out.println(d.toString());
		
		// To print the date sample date which you want 
		
		SimpleDateFormat sdf= new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
	}

}
