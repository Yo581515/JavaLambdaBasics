package Lambdas2PPAP;

public class LambdaExamples3 {
	static String thirdText = ", hey a third text";

	private String fourthText = ", hey a fourth text";

	public void doIt() {

		final String otherText = "Hello, ";

		MyInterface myInterface = (text) -> {
			System.out.println(otherText + text + fourthText);
		};

		myInterface.printIt("ABC");

		fourthText = ", blablabla";

		myInterface.printIt("ABC");

	}

	public static void main(String[] args) {
		LambdaExamples3 instance = new LambdaExamples3();
		instance.doIt();
	}

}
