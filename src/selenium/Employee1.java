package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Employee1 {
public static void main(String[] args) {
	List<Integer> li = new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	/*
	Iterator<Integer> iterator = li.iterator();
	while (iterator.hasNext()) {
		Integer integer = iterator.next();
		System.out.println(integer);
		*/
	ListIterator<Integer> listIterator = li.listIterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());
		
	ListIterator<Integer> listIterator1 = li.listIterator();
	while (listIterator1.hasPrevious()) {
		System.out.println(listIterator1.hasPrevious());
	}
	System.out.println(".......................................................");
	for (int i = li.size()-1; i >=0; i--) {
		System.out.println(li.get(i));
	}
	
	}
}
}
