package Unit1lambdasPPAP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charllotte", "Bronte", 60),
				new Person("Mathew", "Arnold", 39));

		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println();
		printConditionally(people, (p) -> p.getLastName().startsWith("C"));

		System.out.println();
		printConditionally(people, (p) -> p.getFirstName().startsWith("C"));

		System.out.println();
		printConditionally(people, (p) -> true);

		System.out.println();
		printConditionally(people, (p) -> p.getFirstName().startsWith("M"));

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}



	@FunctionalInterface
	interface Condition {
		boolean test(Person p);
	}

}
