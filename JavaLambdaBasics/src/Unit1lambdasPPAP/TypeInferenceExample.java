package Unit1lambdasPPAP;

public class TypeInferenceExample {

	public static void main(String[] args) {
		TypeInferenceExample typeInferenceExample = new TypeInferenceExample();
		
		String text ="Hello Lambda";

//		StringLengthLambda myLambds  = (String s)-> s.length();
//		StringLengthLambda myLambds  = (s)-> s.length();
		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength(text));
		
//		Alt2
		typeInferenceExample.skrivUt(s -> s.length(),text);

	}

	interface StringLengthLambda {
		int getLength(String s);
	}
	
	public void skrivUt(StringLengthLambda myLambda, String text) {
		System.out.println(myLambda.getLength(text));
	}

}
