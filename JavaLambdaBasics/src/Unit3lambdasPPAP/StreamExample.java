package Unit3lambdasPPAP;

import java.util.Arrays;
import java.util.List;

import Unit1lambdasPPAP.Person;

public class StreamExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charllotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));

		people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p.getFirstName()));
		System.out.println();

		long count = people.parallelStream().filter(p -> p.getLastName().startsWith("C")).count();

		System.out.println(count);

	}

}
