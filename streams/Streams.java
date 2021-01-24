
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// import java.util.*;
public class Streams {
	


	public static void main(String args[]){
		Person p1 = new Person("Victor", 25);
		Person p2 = new Person("Pierpaolo", 28);
		Person p3 = new Person("Javi", 22);
		Person p4= new Person("Sergio", 16);
		Person p5 = new Person("Nicolas", 56);
		Person p6 = new Person("Margaret", 22);
		Person p7 = new Person("Piero", 72);

		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		people.add(p7);

		// print all 


		System.out.println(
			people.stream()
			.filter((Person p) -> p.name.charAt(0)=='P')
			.map(p -> p.getName().toUpperCase())
			.collect(Collectors.toList())
		);
		
			System.out.println(people.stream()
			.collect(Collectors.groupingBy( (Person p) -> p.name.charAt(0) == 'P', Collectors.counting())));

			System.out.println(people.stream()
			.collect(Collectors.partitioningBy( (Person p) -> p.name.charAt(0) == 'P', Collectors.counting())));


			System.out.println(people.stream()
			.collect(Collectors.groupingBy( (Person p) -> p.getName(), Collectors.counting())));
		
	
	}
}

class Person{
	public String name;
	public int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	@Override
    public String toString() { 
        return this.name + ", " +this.age;
     } 

}