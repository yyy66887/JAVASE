package day18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"
				+ "��MM��dd��");
		
		System.out.println(sdf.format(d));

	}

}
