package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {
	
		System.out.println("************************************");
		System.out.println("****** CREATING OBJECT ******");
		System.out.println("************************************");

		String strObject = new String("Hello World");
		LegoPerson personOne = new LegoPerson("carpenter", "blue", true);
		LegoPerson personTwo = new LegoPerson("programmer", "red", false);

		String clothingColor = "orange";
		LegoPerson personThree = new LegoPerson("wears orange clothing", clothingColor, false);

		int x = 10;

		double[] numbers = { 1.25, 2, 55.6};

		boolean trueOrFalse = false;

		double[] numbers2 = numbers;

		numbers[1] = 10;

		String name = "John Fulton";
		String name2 = name.toUpperCase();

		LegoPerson nullLegoPerson = null;
		String nullStr = null;
		nullStr = "test";
		double zero = 0;


		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		String hello1 = new String("hello");
		String hello2 = new String("hello");
		String hello3 = hello1;

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** STRING MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String bootcamp = "Tech Elevator";

		System.out.println( bootcamp.length() );
		System.out.println( bootcamp.charAt(5) );

		for (int i = 0; i < bootcamp.length(); i++) {
			System.out.println( bootcamp.charAt(i) );
		}

		// .substring( startingIndex(inclusive), endingIndex(exclusive)
		System.out.println( bootcamp.substring(8, 11) );
		// .substring( staringIndex(inclusive) )  -- returns from starting to end of string
		System.out.println( bootcamp.substring(8) );

		// return true or false is a another string is part of this string - case sensitive
		if ( bootcamp.contains("Elev") ) {
			System.out.println("Contains Elev");
		} else {
			System.out.println("Does not contain Elev");
		}

		// indexOf returns the index the string starts at
		System.out.println( bootcamp.indexOf("Elev") );
		// or -1 if the string doesn't exist in the other string
		System.out.println( bootcamp.indexOf("doesn'tExist") );

		String bootcampWithReplacedLetter = bootcamp.replace("Elev", "----");

		String[] splitString = bootcamp.split(" ");
		String[] splitOnE = bootcamp.split("e");


		String c = String.valueOf('c');

		String countDown = String.join("-->", "Five", "Four", "Three", "Two", "One");
		System.out.println(countDown);

		/* Other commonly used methods
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */


		char[] awesome = { 'A', 'w', 'e', 's', 'o','m','e'};
		String awesomeString = new String( awesome );

		System.out.println( awesomeString );
		

	}
}
