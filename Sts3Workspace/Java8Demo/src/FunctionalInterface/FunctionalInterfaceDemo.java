package FunctionalInterface;

import java.util.*;

public class FunctionalInterfaceDemo {
	
	public void childThread()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {

//		Drawable dr = shape -> System.out.println(" Draw " + shape);
//		dr.draw("circle");
		
//		ArrayList<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.add(new Employee(201, "Rajat"));
//		employeeList.add(new Employee(401, "Rajat"));
//		employeeList.add(new Employee(203, "Pranali"));
//		employeeList.add(new Employee(1001, "Rakesh"));
//		employeeList.add(new Employee(801, "Monali"));
//
//		Comparator<Employee> compraotor = Employee::compareId;
//		
//		Comparator<Employee> compraotor1 = Comparator.comparing(Employee::getName).thenComparing(compraotor).reversed();
//		
//		Collections.sort(employeeList, compraotor1);
//		
//		employeeList.forEach(System.out::println);
//		
//		
		FunctionalInterfaceDemo f = new FunctionalInterfaceDemo();
		Runnable r = f::childThread;
		Thread child = new Thread(r);
		child.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		
		
		
	}
}
