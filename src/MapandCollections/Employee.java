package MapandCollections;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	private int id;
	private String name;
	
	
	private double salary;
	private String email;
	
	
	public Employee(int id, String name, double salary,String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}



	public int getId() {
		return id;

	}

 public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public String getEmail() {
		return email;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",email="+ email+"]";
	}



}
