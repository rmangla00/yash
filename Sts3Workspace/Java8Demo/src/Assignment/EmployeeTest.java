package Assignment;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Yash", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Employee employee2 = new Employee("Ram", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Employee employee3 = new Employee("Sita", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

		// Get employee with exact match name "Yash", if not found print "Not found".
		Optional resultEmployee = employees.stream().filter(employee -> employee.getName().equals("Yash"))
				.findFirst();
		System.out.println(resultEmployee.orElseGet(()-> "Not Found"));


		//// Get employee with matching address "1235"
		Optional<Employee> resultEmployee2 = employees.stream().filter(employee -> employee.getAddress().getZipcode().equals("1235"))
				.findFirst();
		System.out.println(resultEmployee2);

		//// Get all employee having mobile numbers 3333.
		List<Employee> resultEmployees = employees.stream()
				.filter(emp -> emp.getMobileNumbers().stream().anyMatch(mob->mob.getNumber().equals("3333")))
				.collect(Collectors.toList());
		resultEmployees.forEach(System.out::println);

		//// Convert List<Employee> to List<String> of employee name
		List<String> employeesName = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(employeesName);

		//// Collect all the names of employees in a string separated by ||
		String employeesName2=employees.stream().map((emp)->emp.getName()).collect(Collectors.joining(" || "));
		System.out.println(employeesName2);

		//// Change the case of List<String>
		List<String> employeesNameUpperCase = employeesName.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(employeesNameUpperCase);

		//// Sort List<String>
		List<String> employeesNameSorted = employeesName.stream().sorted((emp1,emp2)->emp1.compareTo(emp2)).collect(Collectors.toList());
		System.out.println(employeesNameSorted);

		//// sort List<Employee> based on name
		List<Employee> employeesSortedByName = employees.stream().sorted((emp1,emp2)->emp1.getName().compareTo(emp2.getName())).collect(Collectors.toList());
		employeesSortedByName.forEach(System.out::println);
	}
}
