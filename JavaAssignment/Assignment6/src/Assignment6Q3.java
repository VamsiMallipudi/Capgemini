import java.util.*;
class employee 
{
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public String getDep() {
		return dep;
	}
	int id;
	String name;
	String dep;
	int salary;
	public employee(int id, String name, String dep, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
}

class MynameComp implements Comparator<employee>{
	 
    @Override
    public int compare(employee e1, employee e2) {
    	return e1.getName().compareTo(e2.getName());
    }
}
class MydepComp implements Comparator<employee>{
	 
    @Override
    public int compare(employee e1, employee e2) {
    	return e1.getDep().compareTo(e2.getDep());
    }
}
class MyidComp implements Comparator<employee>{
	 
    @Override
    public int compare(employee e1, employee e2) {
    	return e1.getId()-e2.getId();
    }
}
class MySalaryComp implements Comparator<employee>{
	 
    @Override
    public int compare(employee e1, employee e2) {
    	return e1.getSalary()-e2.getSalary();
    }
}
public class Assignment6Q3 {

	public static void main(String args[])
	{
		employee a=new employee(1,"sai","it",7000);
		employee a2=new employee(3,"bhargav","tech",15000);
		employee a3=new employee(2,"jack","manag",70000);
		employee a4=new employee(7,"kim","it",9000);
		employee a5=new employee(4,"panday","core",12000);

		System.out.println("Enter options \n"+ "1.for ID \n"+"2. for name \n"+ "3. for dep \n"+ "4. for salary \n");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==4)
		{
			Set<employee> e=new TreeSet<>(new MySalaryComp());
			e.add(a);
			e.add(a2);
			e.add(a3);
			e.add(a4);
			e.add(a5);
			for(employee z: e)
			{
				System.out.println(z.id+ " "+ z.name+" "+z.dep+ " "+z.salary);
			}
			
			}
		if(ch==1)
		{
			Set<employee> e=new TreeSet<>(new MyidComp());
			e.add(a);
			e.add(a2);
			e.add(a3);
			e.add(a4);
			e.add(a5);
			for(employee z: e)
			{
				System.out.println(z.id+ " "+ z.name+" "+z.dep+ " "+z.salary);
			}
			
			}
		if(ch==2)
		{
			Set<employee> e=new TreeSet<>(new MynameComp());
			e.add(a);
			e.add(a2);
			e.add(a3);
			e.add(a4);
			e.add(a5);
			for(employee z: e)
			{
				System.out.println(z.id+ " "+ z.name+" "+z.dep+ " "+z.salary);
			}
			
			}
if(ch==3)
{
	Set<employee> e=new TreeSet<>(new MydepComp());
	e.add(a);
	e.add(a2);
	e.add(a3);
	e.add(a4);
	e.add(a5);
	for(employee z: e)
	{
		System.out.println(z.id+ " "+ z.name+" "+z.dep+ " "+z.salary);
	}
	
	}
}
}
