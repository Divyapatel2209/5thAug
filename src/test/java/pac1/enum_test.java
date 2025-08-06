package pac1;

import pac1.enum_test.Day;

public class enum_test {
	
	/*	enum gender 
	{M,F}
	
	public static void main(String[]args)
	{
		System.out.println ( enum_test.gender.F) ;
	}

}*/

	
	enum Day
	{sunday,monday,tuesday,wednesday,thursday,friday,saturday}
	public static void main(String[]args)
	{
		Day today = Day.saturday;
		
		switch(today) {
		case sunday:System.out.println("today is sunday");
		case monday:System.out.println("today is monday");
		case tuesday:System.out.println("today is tuesday");
		case wednesday:System.out.println("today is wednesday");
		case thursday:System.out.println("today is thursday");
		case friday:System.out.println("today is friday");
		case saturday:System.out.println("today is saturday");
		
		}
	}
	}


