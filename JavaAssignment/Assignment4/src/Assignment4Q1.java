import java.util.*;
public class Assignment4Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int res;
		try {
			int a = s.nextInt();
			int b = s.nextInt();
			res = a/b;
			System.out.println(res);
		} catch (ArithmeticException  e) {
			System.out.println("In catch method");
			e.printStackTrace();
		}
		finally {
			System.out.println("Main method ends");
			s.close();
		}
	}

}
