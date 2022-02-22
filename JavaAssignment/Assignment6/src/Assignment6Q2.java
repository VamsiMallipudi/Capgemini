import java.util.HashSet;

public class Assignment6Q2 {

	public static void main(String[] args) {
		//LinkedHashSet<Integer> h = new LinkedHashSet<>();
		HashSet<Integer> h = new HashSet<>();
		h.add(10);
		h.add(15);
		h.add(20);
		h.add(25);
		h.add(30);
		h.add(10);
		h.add(25);
		h.add(40);
		h.add(45);
		h.add(50);
		h.add(55);
		
		for(Integer i:h) {
			System.out.println(i);
		}
	}

}
