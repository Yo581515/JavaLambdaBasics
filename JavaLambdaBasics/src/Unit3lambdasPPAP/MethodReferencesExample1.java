package Unit3lambdasPPAP;

public class MethodReferencesExample1 {
	public static void main(String[] args) {

		Thread t = new Thread(MethodReferencesExample1::printMessage);// p -> method(p)
		// Thread t = new Thread(() -> printMessage());
		t.start();

	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
