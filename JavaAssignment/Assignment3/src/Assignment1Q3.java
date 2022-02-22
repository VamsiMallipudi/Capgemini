
public class Assignment1Q3 {

	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		String str1 = str.toLowerCase();
		System.out.println(str1);
		
		String str2 = str.toUpperCase();
		System.out.println(str2);
		
		String str3 = str.replace("a", "$");
		System.out.println(str3);
		
		if(str.contains("collection")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String str4 = "Java String pool refers to collection of Strings which are stored in heap memory";
		if(str == str4) {
			System.out.println("str and str4 are equal");
		}
		else {
			System.out.println("str and str4 are not equal");
		}
		
		if(str.equals(str4)) {
			System.out.println("str and str4 are equal");
		}
		else {
			System.out.println("str and str4 are not equal");
		}
	}

}
