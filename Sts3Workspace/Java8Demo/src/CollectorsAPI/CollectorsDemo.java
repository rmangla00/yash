package CollectorsAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {

		ArrayList<Employee1> employeeList = new ArrayList<Employee1>();
		employeeList.add(new Employee1(201, "Rajat", 6000));
		employeeList.add(new Employee1(401, "Rajat", 4000));
		employeeList.add(new Employee1(203, "Pranali", 5500));
		employeeList.add(new Employee1(1001, "Rakesh", 6000));
		employeeList.add(new Employee1(801, "Monali", 4000));

		Stream<Employee1> sEmp = employeeList.stream();
		
		Stream<Integer> sInt = Stream.of(5, 10, 20, 50);
		
//		double d = sEmp.collect(Collectors.averagingLong(e->e.getSalary()));
//		
//		Integer sum = sInt.collect(Collectors.reducing(1, (e1,e2)->e1+e2));
	
//		Function< Employee, Long> f =e->e.getSalary();
//		
		Map<Long, List<Employee1>> res =sEmp.collect(Collectors.groupingBy(e->e.getSalary()));
	
//		Map<Boolean, Long> res=sInt.collect(Collectors.partitioningBy(i->i%2==0, Collectors.counting()));
		
//		Map<Boolean, List<Employee>> res=sEmp.collect(Collectors.partitioningBy(e->e.getSalary()>=5500));
		
//		Map<String, Long> res = sEmp.collect(Collectors.toMap(e->e.getName(), e->e.getSalary(), (o,n)->n));
		
//		IntSummaryStatistics res = sEmp.collect(Collectors.summarizingInt(e->e.getId()));
		
		System.out.println(res);
		
		
		

		
	}
}
