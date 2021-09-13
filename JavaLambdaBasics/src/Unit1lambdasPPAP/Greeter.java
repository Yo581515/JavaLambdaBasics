package Unit1lambdasPPAP;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		
//      1) new Objekt
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
//		2) Lambda Expression
//		MyLambda myLambdaFunction = ()-> System.out.println("Hello from Lambda");
		Greeting lambdaGreeting = ()-> System.out.println("Hello from Lambda!");
		greeter.greet(lambdaGreeting);
		
//		3) innerClass 
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello from innerClassGreeting!");
			}

//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
		};
		greeter.greet(innerClassGreeting);
//		System.out.println((innerClassGreeting.add(5, 6)));
		
//		4)
		greeter.greet(()-> System.out.println("Hello from Lambda! example 4"));
		

		
		
		
//		MyAdd addFunction = (int a, int b) -> a+b;
//		System.out.println(addFunction.add(2, 3));
		

		
		
		

//		Runnable
//		new Thread(() -> System.out.println("Hello World1")).start();

	}
	
//	interface MyLambda {
//		void foo();	
//	}
	
//	interface MyAdd {
//		int add(int x, int y);	
//	}

}
