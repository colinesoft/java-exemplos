package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dt = sdf.parse("26/09/2018");
		
		System.out.println(sdf.format(dt));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		cal.add(Calendar.MONTH, 2);
		dt = cal.getTime();
		
		System.out.println(sdf.format(dt));
	}

}
