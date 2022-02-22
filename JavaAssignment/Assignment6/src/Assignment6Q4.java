import java.util.*;
import java.time.*;
class date
{
	LocalDate d;

	public date(int a,int b,int c) {
		super();
		this.d = LocalDate.of(a, b, c);
	}
	public LocalDate get()
	{
		return d;
	}
}
public class Assignment6Q4 {

	public static void main(String[] args) {
		

		date n=new date(2004,12,15);
		date m=new date(2001,12,15);
		date o=new date(2008,12,15);
		date p=new date(2006,12,15);
		LinkedList<date> j=new LinkedList<>();
		j.add(n);
		j.add(m);
		j.add(o);
		j.add(p);
		Iterator<date> tr=j.descendingIterator();
		while(tr.hasNext())
		{
			date r=tr.next();
			LocalDate z=r.get();
			if( z.isLeapYear())
				System.out.println("Your date of birth "+ z+" was a leap year" );
			else
			{
				System.out.println("Your date of birth "+ z+" was not a leap year" );
			}
		}
	/*	
		LocalDate a=LocalDate.of(2001,12,15);
		LocalDate b=LocalDate.of(2004,12,15);
		LocalDate c=LocalDate.of(2000,12,15);
		LocalDate d=LocalDate.of(2006,12,15);
		LinkedList<LocalDate> s=new LinkedList<>();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		Iterator<LocalDate> itr=s.descendingIterator();
		while(itr.hasNext())
		{
			LocalDate z=itr.next();
			if( z.isLeapYear())
				System.out.println("Your date of birth "+ z+" was a leap year" );
			else
			{
				System.out.println("Your date of birth "+ z+" was not a leap year" );
			}
		}*/
	}

}
