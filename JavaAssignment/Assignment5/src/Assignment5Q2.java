import java.util.*;

public class Assignment5Q2 {

	public static void main(String[] args) {
		HashMap<Integer,Double> random = new HashMap<>();
		random.put(1, 1.0);
		random.put(2, 2.0);
		random.put(3, 3.0);
		random.put(4, 4.0);
		random.put(5, 5.0);
		random.put(6, 6.0);
		random.put(7, 7.0);
		random.put(8, 8.0);
		random.put(9, 9.0);
		random.put(10,10.0);
		
		Set <Integer> keys = random.keySet();
		for(Integer i:keys) {
			System.out.println(i+" "+random.get(i));
		}
	}
}
