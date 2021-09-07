package lambdasPPAP;

public class RunnableExample {

	public static void main(String[] args) {

//		1)
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside anonymClass Runnable");
			}
		});
		myThread.run();

//		2)
		Thread myLambdsThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdsThread.run();

//		3)
		new Thread(() -> System.out.println("Printed inside Lambda with out variable declaration")).run();

	}

}
