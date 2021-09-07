package Lambdas2PPAP;


import java.io.IOException;
import java.util.Comparator;

public class LambdaExamples {
	public static void main(String[] args) throws IOException {
		
		// Java Lambda Expressions #1 - The Basics
		// 1)
		Comparator<String> stringCompatarator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		int conmparison = stringCompatarator.compare("hello", "world");
		System.out.println(conmparison);

		// 2)
		Comparator<String> stringCompataratorLambda = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};
		conmparison = stringCompataratorLambda.compare("hello", "world");
		System.out.println(conmparison);

		// 3)
		Comparator<String> stringCompataratorLambda2 = (o1, o2) -> o1.compareTo(o2);
		conmparison = stringCompataratorLambda2.compare("hello", "world");
		System.out.println(conmparison);

		// 4)
		/*
		 * MyFunction myFunction = (text1, text2) -> { System.out.println(text1 + " " +
		 * text2); }; myFunction.apply("Hello", "World");
		 */

		// 5)
		MyFunction myFunction = (text1, text2) -> {
			System.out.println(text1 + " " + text2);
			return text1 + " " + text2;
		};
		String returnValue = myFunction.apply("Hello", "World");
		System.out.println(returnValue);

//		// 6)
//		MyFunction myFunction2 = new MyFunction();
//		String returnValue2 = myFunction2.apply("hei", "verden");
//		System.out.println(returnValue2);

		System.out.println(
				".+" + "-----------------------------------------------------------------------------------------+.");
		
		
		/*
		 * java lambda expresssion can implement interfaces with 
		 * a single unimplemented method(abstract) method,
		 * but as many default or static methods as you like
		 */
		

		// Java Lambda Expressions #2 - Functional Interfaces
		
		// 1)
		MyInterface myInterface = (text) -> {
			System.out.println(text);
		};
		myInterface.printIt("ALOHA VERDEN");
		//myInterface.printUtf8To("Hello World", new FileOutputStream("data.txt"));
		MyInterface.printItToSystemOut("Helo Out");
		
		
		
		System.out.println(
				".+" + "-----------------------------------------------------------------------------------------+.");

		

	}
}
