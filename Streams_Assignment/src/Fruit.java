import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	
	String name;
	int calories;
	int price;
	String color;
	
	public Fruit(String name,int calories,int price,String color) {
		this.name = name;
		this.calories =calories;
		this.price = price;
		this.color = color;
	}


public static class JavaStream{
	public static void main(String[] args) {
		
		List<Fruit> fruitlist = new ArrayList<Fruit>();
		
		fruitlist.add(new Fruit("apple",100,100,"red"));
		fruitlist.add(new Fruit("promaganed",80,200,"red"));
		fruitlist.add(new Fruit("strawberry",50,100,"red"));
		fruitlist.add(new Fruit("dragon fruit",60,200,"red"));
		fruitlist.add(new Fruit("papaya",200,150,"orange"));
		fruitlist.add(new Fruit("pineapple",300,200,"yellow"));
		
		//1. Display the fruit names of low calories fruits 
		//i.e. calories < 100 sorted in descending order of calories.
		List<String> fruitlist2 = fruitlist.stream()
				.filter(p ->p.calories < 100)
				.map(p -> p.name)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(fruitlist2);
		
	//3. Display only RED color fruits sorted 
		//as per their price in ascending order
		List<String> fruitlist3 = fruitlist.stream()
				.filter(p -> p.color == "red")
				.map(p -> p.name)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(fruitlist3);
		
		
	}
}
}