import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Assignment9Q3 {

	public static void main(String[] args) {
		ArrayList<Trader> q=new ArrayList<>();
		Trader a=new Trader("sai","pune");
		Trader b=new Trader ("dill","goa");
		Trader c=new Trader("vasu","pune");
		Trader d=new Trader ("jones","indore");
		Trader e=new Trader ("you","indore");
		Trader f=new Trader("arith","pune");

		
		
		q.add(a);
		q.add(b);
		q.add(c);
		q.add(d);
		q.add(e);
		q.add(f);
		
		TreeSet<String> t = new TreeSet<>();
		//Question1
		 q.stream()
		.filter((p1)->t.add(p1.city))
		.distinct()
		.forEach(p1->System.out.println(p1.getCity()));
		
		 System.out.println("--------------------------");
		 
		 //Question2
		 q.stream()
		 .filter(p1->p1.getCity().equals("pune"))
		 .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
		 .forEach(p1->System.out.println(p1.getName()));
		 System.out.println("--------------------------");
		 //Question3
		 q.stream()
		 .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
		 .forEach(p1->System.out.println(p1.getName()));
		 
		 //Question4
		 System.out.println("--------------------------");
		 q.stream()
		 .filter(p1->p1.getCity().equals("indore"))
		 .forEach(p1->System.out.println(p1.getName()));
	}

}
