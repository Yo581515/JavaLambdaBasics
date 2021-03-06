package Unit3lambdasPPAP;

import java.util.Arrays;
import java.util.List;

import Unit1lambdasPPAP.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charllotte", "Bronte", 60),
				new Person("Mathew", "Arnold", 39));

		System.out.println("Using for in loop");
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println();

		System.out.println("using lambda for foreach. noop");
//		people.forEach((p) -> System.out.println(p));
		people.forEach(System.out::println);

	}
}
