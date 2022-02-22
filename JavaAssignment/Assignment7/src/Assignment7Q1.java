import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String testtype() default "Manually";
	//int tests() default 1;
}

class Testing{
	@Test(testtype = "Computer")
	public void testcase() {
		System.out.println("In testing");
	}
}


public class Assignment7Q1 {
	
	public static void main(String[] args) {
		Testing a = new Testing();
		Method c = a.getClass().getMethod("Hiii",c);
		Annotation an = c.getAnnotation(Test.class);
		Test s = (Test)an;
		System.out.println(s.testtype());
		//a.testcase();
		//System.out.println(a);
	}

}
