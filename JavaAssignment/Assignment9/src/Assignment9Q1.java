import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Assignment9Q1 {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("Cherry",85,50,"Red"),
				new Fruit("Banana",115,50,"Yellow"),
				new Fruit("Pomegranate",145,150,"Red"),
				new Fruit("Guava",135,40,"Green"),
				new Fruit("Apple",90,100,"Red"),
				new Fruit("CustardApple",15,70,"Grey"));
		
		fruits.stream()
		.filter(f->f.getCalories() < 100)
		.forEach(f->System.out.println(f.getName()));
		
		System.out.println("---------------");
		
		fruits.stream()
		.filter(f->f.getColor().startsWith("R"))
		.sorted((p1,p2)->p1.getPrice()-p2.getPrice())
		.forEach(f->System.out.println(f.getName()));
		
		System.out.println("---------------");
		
		fruits.stream()
		.sorted((p1,p2)->p1.getColor().compareTo(p2.getColor()))
		.forEach(f->System.out.println(f.getName()));
	}

}
