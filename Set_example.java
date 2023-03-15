package set_family;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_example {

	public static void main(String[] args) {
		
		Set<Integer>numbers = new HashSet<Integer>();
		//insted of Hashset we can set to create an object?
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(10);
		System.out.println(numbers);
		
		numbers.remove(10);
		System.out.println(numbers);
		
		
		System.out.println("***********");
		
		Iterator<Integer>It = numbers.iterator();
		while(It.hasNext()) {
			int eachnumbers = It.next();
			System.out.println("coming from Iterator " + eachnumbers);	
		}
		numbers.remove(50);
		System.out.println(numbers);
		
		
		System.out.println("*******");
		
		ArrayList<Integer>numbers1 =new ArrayList<Integer>();
		numbers1.add(10);
		numbers1.add(20);
		numbers1.add(30);
		numbers1.add(40);
		numbers1.add(50);
		numbers1.add(10);
		System.out.println(numbers1);
		
		System.out.println(numbers1.size());
		
		Iterator<Integer>It1=numbers1.iterator();
		while(It1.hasNext()) {
			int eachnumbers = It1.next();
			System.out.println("coming from it1 " + eachnumbers);
		} 
		
		
		System.out.println("***********");
		for(int eachvalue:numbers1) {
			System.out.println("coming from loop "+ eachvalue);
		}
		
		
		System.out.println("*********");
		
		
		for(int i=0; i< numbers1.size(); i ++) {
			System.out.println("coming from traditional forloop " + numbers1.get ( i ));
		}
		
		
		System.out.println("*******");
			
		Set<Integer>numbers2 = new HashSet<Integer>();
		numbers2.add(10);
		numbers2.add(25);
		System.out.println(numbers2);
		numbers.addAll(numbers2);
		System.out.println("Adding two set together"+ numbers);
		
			
		}
		
	}


