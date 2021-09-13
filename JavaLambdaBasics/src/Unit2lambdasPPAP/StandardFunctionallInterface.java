package Unit2lambdasPPAP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Unit1lambdasPPAP.Person;

public class StandardFunctionallInterface {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charllotte", "Bronte", 60),
				new Person("Mathew", "Arnold", 39));

		System.out.println();
		performConditionally(people, (p) -> true, (p) -> System.out.println(p));

		System.out.println();
		performConditionally(people, (p) -> p.getLastName().startsWith("C"), (p) -> System.out.println(p));

		System.out.println();
		performConditionally(people, (p) -> p.getFirstName().startsWith("C"), (p) -> System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
