
public class Asignment5Q3 {

	public static void main(String[] args) {
		Integer [] arr = {10,20,30,40,50,60,70};
		swap<Integer> n = new swap<Integer>(arr);
		n.swap(2, 3);
		Integer m[] = n.getA();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]+" ");
		}
	}

}
