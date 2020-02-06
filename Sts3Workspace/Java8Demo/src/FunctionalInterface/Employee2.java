package FunctionalInterface;

public class Employee2 {
	int id;
	String name;
	
	public Employee2(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public static int compareId(Employee2 emp1,Employee2 emp2) {
		return emp1.getId()-emp2.getId();
	}
}
