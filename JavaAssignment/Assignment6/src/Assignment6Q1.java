
import java.util.*;
enum gender
{
	MALE,
	FEMALE;
}
class contact
{
	long ph;
	String name;
	String email;
	gender g;
	public contact(long ph, String name, String email, gender g) {
		super();
		this.ph = ph;
		this.name = name;
		this.email = email;
		this.g = g;
	}
	
}
public class Assignment6Q1 {

	public static void main(String[] args) {
		
		contact a=new contact(154789,"Vamsi","Vamsi@gmail",gender.MALE);
		contact b=new contact(145789,"Sudheer","Sudheer@gmail",gender.MALE);
		contact m=new contact(145732,"Sriram","Sriram@gmail",gender.MALE);
		contact d=new contact(145789,"Hari","Hari@gmail",gender.MALE);
		TreeMap<Long,contact> l=new TreeMap<>(Collections.reverseOrder());
		l.put(a.ph, a);
		l.put(b.ph,b);
		l.put(m.ph, m);
		l.put(d.ph,d);
		for(Map.Entry<Long,contact> e: l.entrySet())
		{
			
			System.out.println(e.getKey());
			
		}
		System.out.println("---------------");
		for(Map.Entry<Long,contact> e: l.entrySet())
		{
			contact c=e.getValue();
			System.out.println(c.ph+" "+c.name+" "+c.email+" "+c.g);
		}	
	//	System.out.println(l);
	}

}

