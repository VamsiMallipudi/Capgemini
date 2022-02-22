import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorId();
	String Date();
	String time();
	int Version();
}


@info(AuthorId=1,Date="10-02-2022",time="09:30",Version=10)
class information{
	String AuthorName;
	String Description;
	public information(String authorName, String description) {
		super();
		AuthorName = authorName;
		Description = description;
	}
}


public class Assignment7Q2 {

	public static void main(String[] args) {
		information obj = new information("Alex","He is a good programmer");
		//System.out.println(obj.AuthorName);
		info c = obj.getClass();
		Annotation an = c.getAnnotation(information.class);
		info i = (info)an;
		System.out.println(i.AuthorId());
		System.out.println(i.Date());
		System.out.println(i.time());
		System.out.println(i.Version());
	}

}
