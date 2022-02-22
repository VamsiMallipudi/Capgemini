import java.util.*;
public class Assignment4Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		try {
			float res = divide(a,b);
			System.out.println(res);
			
		} catch (UnsupportedOperationException e) {
			System.out.println("Denominator should not be zero..");
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("in finally block");
			s.close();
		}
	}
	
	public static int divide(int num1,int num2) {
		if(num2==0) {
			throw new UnsupportedOperationException("Denominator is zero");//in () is e 
		}
		float c = num1/num2;
		return c;
	}

}
