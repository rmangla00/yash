package StreamAPI;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Employee3> employeeList = new ArrayList<Employee3>();
		employeeList.add(new Employee3(201, "Rajat", 3000));
		employeeList.add(new Employee3(401, "Rajat", 4000));
		employeeList.add(new Employee3(203, "Pranali", 5500));
		employeeList.add(new Employee3(1001, "Rakesh", 6000));
		employeeList.add(new Employee3(801, "Monali", 6700));

		Predicate<Employee3> p = (e) -> e.getSalary() > 2000;
		Stream<Employee3> es = employeeList.stream();
		boolean result = es.noneMatch(p);

		// System.out.println(result);

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(60);
		l.add(50);
		Stream s = l.parallelStream();
		s.limit(3).forEach(System.out::println);

		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(30);
		l2.add(60);
		l2.add(50);
		Stream s2 = l2.stream();
		

		// Stream.concat(s, s2).forEach(System.out::println);

		// res.forEach(System.out::println);

		// employeeList.stream().filter((e)->e.getSalary()>5000).forEach(System.out::println);

//		Stream<List<String>> namesOriginalList = Stream.of(
//				Arrays.asList("Pankaj"),
//				Arrays.asList("David", "Lisa"),
//				Arrays.asList("Amit"));
//		
//		//flat the stream from List<String> to String stream
//		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());
//
//		flatStream.forEach(System.out::println);

//		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
//
//		Integer intOptional = numbers.reduce((i, j) -> i+j).get();
//		
//		System.out.println(intOptional);
		
		List<List<String>> ll = new ArrayList<List<String>>();
		List<String> ll1 = Arrays.asList("Pankaj", "Rahul");	
		List<String> ll2 = Arrays.asList("David", "Lisa");		
		List<String> ll3 = Arrays.asList("Simran", "Amit");		
		ll.add(ll1);
		ll.add(ll2);
		ll.add(ll3);
		
		Stream<List<String>> sl = ll.stream();
		
		//sl.forEach(System.out::println);
		
		sl.flatMap(st->st.stream()).forEach(System.out::println);
		
		
		
		
		

		
	}
}
