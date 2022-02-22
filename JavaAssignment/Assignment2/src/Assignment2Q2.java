import java.util.ArrayList;
class employee extends Assignment2Q2
{
	public int getsalary(int salary)
	{
		int incentive=5000;
		return incentive+salary;
	}
}
class labour extends Assignment2Q2
{
	public int getsalary(int salary)
	{
		int overtime=500;
		return overtime+salary;
	}
}
public class Assignment2Q2 {

	public static int salary=10000;
	public int totalsalary(ArrayList<Integer> Tsalary)
	{
		int a=0;
		for(int i=0;i<Tsalary.size();i++)
		{
			a=a+Tsalary.get(i);
		}
		return a;
	}
	public static void main(String[] args) {
		Assignment2Q2 l=new Assignment2Q2();

		ArrayList<Integer> k=new ArrayList();
		employee a=new employee();
		labour b=new labour();
		int m=a.getsalary(salary);
		k.add(m);
		int n=b.getsalary(salary);
		k.add(n);
		int x=l.totalsalary(k);
		System.out.println(x);

	}

}
