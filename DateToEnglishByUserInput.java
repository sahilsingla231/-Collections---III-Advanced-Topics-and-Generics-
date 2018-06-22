package generics;

import java.util.HashMap;
import java.util.*;
/**
*
* @author Sahil
*/

//Now i have covered all cases of user input :-)

public class DateToEnglishByUserInput {
	
	// I have used 4 hash map...
	public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> last = new HashMap<String, String>();
	public static HashMap<String, String> first = new HashMap<String, String>();

	public static void dateconvert()
	{
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Ninth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Twelveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twenty Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Ninth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		
		first.put("00", "Hundred"); //first get year ending two digits part
		first.put("01", "First");
		first.put("02", "Second");
		first.put("03", "Third");
		first.put("04", "Fourth");
		first.put("05", "Fifth");
		first.put("06", "Sixth");
		first.put("07", "Seventh");
		first.put("08", "Eighth");
		first.put("09", "Ninth");
		first.put("10", "Tenth");
		
		first.put("11", "Eleventh");
		first.put("12", "Twelve");
		first.put("13", "Thirteen");
		first.put("14", "Fourteen");
		first.put("15", "Fifteen");
		first.put("16", "Sixteen");
		first.put("17", "Seventeen");
		first.put("18", "Eighteen");
		first.put("19", "Nineteen");
		first.put("20", "Twenty");
		
		first.put("21", "Twenty One");
		first.put("22", "Twenty Two");
		first.put("23", "Twenty Three");
		first.put("24", "Twenty Four");
		first.put("25", "Twenty Five");
		first.put("26", "Twenty Six");
		first.put("27", "Twenty Seven");
		first.put("28", "Twenty Eight");
		first.put("29", "Twenty Nine");
		first.put("30", "Thirty");

		first.put("31", "Thirty one");
		first.put("32", "Thirty two");
		first.put("33", "Thirty three");
		first.put("34", "Thirty four");
		first.put("35", "Thirty five");
		first.put("36", "Thirty six");
		first.put("37", "Thirty seven");
		first.put("38", "Thirty eight");
		first.put("39", "Thirty nine");
		
		first.put("40", "Forty");
		first.put("41", "Forty one");
		first.put("42", "Forty two");
		first.put("43", "Forty three ");
		first.put("44", "Forty four");
		first.put("45", "Forty five");
		first.put("46", "Forty six");
		first.put("47", "Forty seven");
		first.put("48", "Forty eight");
		first.put("49", "Forty nine");
		
		first.put("50", "Fifty");
		first.put("51", "Fifty one");
		first.put("52", "Fifty two");
		first.put("53", "Fifty three");
		first.put("54", "Fifty four");
		first.put("55", "Fifty five");
		first.put("56", "Fifty six");
		first.put("57", "Fifty seven");
		first.put("58", "Fifty eight");
		first.put("59", "Fifty nine");
		
		first.put("60", "Sixty");
		first.put("61", "Sixty one");
		first.put("62", "Sixty two");
		first.put("63", "Sixty three");
		first.put("64", "Sixty four");
		first.put("65", "Sixty five");
		first.put("66", "Sixty six");
		first.put("67", "Sixty seven");
		first.put("68", "Sixty eight");
		first.put("69", "Sixty nine");
		
		first.put("70", "Seventy");
		first.put("71", "Seventy one");
		first.put("72", "Seventy two");
		first.put("73", "Seventy three");
		first.put("74", "Seventy four");
		first.put("75", "Seventy five");
		first.put("76", "Seventy six");
		first.put("77", "Seventy seven");
		first.put("78", "Seventy eight");
		first.put("79", "Seventy nine");
		
		first.put("80", "Eighty");
		first.put("81", "Eighty one");
		first.put("82", "Eighty two");
		first.put("83", "Eighty three");
		first.put("84", "Eighty four");
		first.put("85", "Eighty five");
		first.put("86", "Eighty six");
		first.put("87", "Eighty seven");
		first.put("88", "Eighty eight");
		first.put("89", "Eighty nine");
		
		first.put("90", "Ninety");
		first.put("91", "Ninety one");
		first.put("92", "Ninety two");
		first.put("93", "Ninety three");
		first.put("94", "Ninety four");
		first.put("95", "Ninety Five");
		first.put("96", "Ninety Six");
		first.put("97", "Ninety seven");
		first.put("98", "Ninety eight");
		first.put("99", "Ninety nine");
		
		
		last.put("00", ""); //last get year front part
		last.put("01", "One");
		last.put("02", "Two");
		last.put("03", "Three");
		last.put("04", "Four");
		last.put("05", "Five");
		last.put("06", "Six");
		last.put("07", "Seven");
		last.put("08", "Eight");
		last.put("09", "Nine");
		last.put("10", "Ten");
		last.put("11", "Eleven");
		last.put("12", "Twelve");
		last.put("13", "Thirteen");
		last.put("14", "Fourteen");
		last.put("15", "Fifteen");
		last.put("16", "Sixteen");
		last.put("17", "Seventeen");
		last.put("18", "Eighteen");
		last.put("19", "Nineteen");
		last.put("20", "Twenty");
		last.put("21", "Twenty One");
		last.put("22", "Twenty Two");
		last.put("23", "Twenty Thee");
		last.put("24", "Twenty Four");
		last.put("25", "Twenty Five");
		last.put("26", "Twenty Six");
		last.put("27", "Twenty Seven");
		last.put("28", "Twenty Eight");
		last.put("29", "Twenty Nine");
		
		last.put("30", "Thirty");

		last.put("31", "Thirty one");
		last.put("32", "Thirty two");
		last.put("33", "Thirty three");
		last.put("34", "Thirty four");
		last.put("35", "Thirty five");
		last.put("36", "Thirty six");
		last.put("37", "Thirty seven");
		last.put("38", "Thirty eight");
		last.put("39", "Thirty nine");
		
		last.put("40", "Forty");
		last.put("41", "Forty one");
		last.put("42", "Forty two");
		last.put("43", "Forty three ");
		last.put("44", "Forty four");
		last.put("45", "Forty five");
		last.put("46", "Forty six");
		last.put("47", "Forty seven");
		last.put("48", "Forty eight");
		last.put("49", "Forty nine");
		
		last.put("50", "Fifty");
		last.put("51", "Fifty one");
		last.put("52", "Fifty two");
		last.put("53", "Fifty three");
		last.put("54", "Fifty four");
		last.put("55", "Fifty five");
		last.put("56", "Fifty six");
		last.put("57", "Fifty seven");
		last.put("58", "Fifty eight");
		last.put("59", "Fifty nine");
		
		last.put("60", "Sixty");
		last.put("61", "Sixty one");
		last.put("62", "Sixty two");
		last.put("63", "Sixty three");
		last.put("64", "Sixty four");
		last.put("65", "Sixty five");
		last.put("66", "Sixty six");
		last.put("67", "Sixty seven");
		last.put("68", "Sixty eight");
		last.put("69", "Sixty nine");
		
		last.put("70", "Seventy");
		last.put("71", "Seventy one");
		last.put("72", "Seventy two");
		last.put("73", "Seventy three");
		last.put("74", "Seventy four");
		last.put("75", "Seventy five");
		last.put("76", "Seventy six");
		last.put("77", "Seventy seven");
		last.put("78", "Seventy eight");
		last.put("79", "Seventy nine");
		
		last.put("80", "Eighty");
		last.put("81", "Eighty one");
		last.put("82", "Eighty two");
		last.put("83", "Eighty three");
		last.put("84", "Eighty four");
		last.put("85", "Eighty five");
		last.put("86", "Eighty six");
		last.put("87", "Eighty seven");
		last.put("88", "Eighty eight");
		last.put("89", "Eighty nine");
		
		
		last.put("91", "Ninety one");
		last.put("92", "Ninety two");
		last.put("93", "Ninety three");
		last.put("94", "Ninety four");
		last.put("95", "Ninety five");
		last.put("96", "Ninety six");
		last.put("97", "Ninety seven");
		last.put("98", "Ninety eight");
		last.put("99", "Ninety nine");
		

	}

	public static String convert(String Input) 
	{
		String d = Input.substring(0, 2); //my this code will get day
		String m = Input.substring(3, 5); //my this code will get month
		String ylastfront = Input.substring(6, 8); //my this code will get yearpartfront
		String yfirstend = Input.substring(8, 10);//my this code will get yearpartback
		return date.get(d) + " " + month.get(m) + " " + last.get(ylastfront) + " " + first.get(yfirstend);
	}

	public static void main(String args[]) 
	{
		dateconvert(); //as it is static
		
		System.out.println("25-05-2017");
		System.out.println(convert("25-05-2017"));
		
		System.out.println("21-11-1996");
		System.out.println(convert("21-11-1996"));
		
		
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the Date in DD-MM-YYYY format");
	        String date=scan.next();
		
			System.out.println(convert(date));  

		
		scan.close();


	}
		
	        

}
