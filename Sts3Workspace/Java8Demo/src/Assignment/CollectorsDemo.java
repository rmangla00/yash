package Assignment;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 11, 20, 33, 4, 44, 55, 20);

		//// collect the result of a Stream into Set
		Set<Integer> numbersSet = numbers.stream().collect(Collectors.toSet());
		System.out.println(numbersSet);

		//// collect the result of a Stream into list
		List<Integer> numbersList = numbers.stream().collect(Collectors.toList());
		System.out.println(numbersList);

		//// create Map from the elements of Stream (first remove the duplicates)
		Map<Integer, Integer> numbersMap = numbers.stream().collect(Collectors.toMap(n -> n, n -> n, (old, nw) -> nw));
		System.out.println(numbersMap);

		//// find summary statistics from a Stream of numbers
		IntSummaryStatistics summaryStat = numbers.stream().collect(Collectors.summarizingInt(n -> n));
		System.out.println(summaryStat);

		//// partition the result of Stream in two parts i.e., odd and even
		// Map<Boolean, List<Integer>> oddEven =
		//// numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));

		Map<String, List<Integer>> oddEven = numbers.stream()
				.collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));
		System.out.println(oddEven);

		//// create comma separated string from numbers
		String commaSepratedString = numbers.stream().map(x -> x.toString()).collect(Collectors.joining(","));
		System.out.println(commaSepratedString);

	}
}
