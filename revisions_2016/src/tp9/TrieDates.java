package tp9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrieDates extends Date {

	public static void main(String[] args) {
		Date dates[] = new Date[3];
		
		dates[1].y=2012;
		dates[1].m=11;
		dates[1].d=18;
		dates[2].y=2016;
		dates[2].m=12;
		dates[2].d=30;
		dates[3].y=2015;
		dates[3].m=10;
		dates[3].d=28;
		
		Arrays.sort(dates);
		
	}

}
