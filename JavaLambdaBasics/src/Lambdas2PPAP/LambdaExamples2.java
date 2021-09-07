package Lambdas2PPAP;

public class LambdaExamples2 {
	// Java Lambda Expressions #3 - Variable Capture

	static String thirdText = ", hey a third text";

	public static void main(String[] args) {

		final String otherText = "Hello, ";

		MyInterface myInterface = (text) -> {
			System.out.println(otherText + text + thirdText);
		};

		myInterface.printIt("ABC");
		
		thirdText = ", blablabla";

		myInterface.printIt("ABC");

	}

}
