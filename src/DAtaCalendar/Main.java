package DAtaCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, -4);
		int min = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		d = cal.getTime();
		
		System.out.println("Nova hora: " + sdf.format(d));
		System.out.println("Minutos: " + min);

	}

}
