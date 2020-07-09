package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> nameIn= new LinkedList<>();
		nameIn.add("C");
		nameIn.add("D");
		nameIn.add("F");
		nameIn.add("G");
		nameIn.add("H");
		nameIn.add("I");
		System.out.println(nameIn);

		System.out.println("The initial letter name in the list is: " + nameIn.peek());

		nameIn.remove("G");
		System.out.println(nameIn);

		System.out.println(nameIn.poll());

		for (String nameint : nameIn)
			System.out.println(nameint);

		Iterator<String> name = nameIn.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());
		}
	}
}
