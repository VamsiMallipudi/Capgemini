package junitbasics;

public class Assign1Q3 {
	
	 static int b=40000;
	public static void bank(int a) throws InsufficientFundsExpcetion
	{
			if(b-a<0)
			{
				throw new InsufficientFundsExpcetion();
			}
			else
			{
				System.out.println("balance:" + (b-a));
			}
	}

	public static void main(String[] args) {
		
		try {
			bank(30000);
		} catch (InsufficientFundsExpcetion e) {
			e.printStackTrace();
		}

	}

}
