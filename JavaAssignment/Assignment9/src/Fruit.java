
public class Fruit {
	private String name;
	private int Calories;
	private int price;
	private String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		Calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return Calories;
	}
	public void setCalories(int calories) {
		Calories = calories;
	}
	public  int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
