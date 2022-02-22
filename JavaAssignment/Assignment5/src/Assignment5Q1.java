import java.util.*;

class employee{
	int id;
	String name;
	int salary;
	String department;
	public employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void display() {
		System.out.println(id+" "+name+" "+salary+" "+department);
	}
}

class demo{
	int id;
	demo(int a){
		this.id=a;
	}
	void display() {
		System.out.println(id);
	}
}

public class Assignment5Q1 {

	public static void main(String[] args) {
		HashSet<employee> h  = new HashSet<>();
		employee e = new employee(1,"Vamsi",100000,"ECE");
		employee f = new employee(2,"Sudheer",100000,"CSE");
		demo d = new demo(1);
		h.add(e);
		h.add(f);
		//h.add(d);
		for(employee s:h) {
			s.display();
		}
	}

}
