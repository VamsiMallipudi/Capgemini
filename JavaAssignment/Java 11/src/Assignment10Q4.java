import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Assignment10Q4 {

	public static void main(String[] args) throws IOException {
		var path = Paths.get("C:/","workspace","StudentList.txt");
		
		String a = Files.readString(path);
		
		System.out.println(a.lines().filter(str->!str.isBlank()).count());
		
		
		a.lines()
		.filter(str->!str.isBlank())
		.forEach(System.out::println);
		
		
	}

}
