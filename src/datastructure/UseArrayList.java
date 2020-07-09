package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("Fork");
		list.add("Spoon");
		list.add("knife");
		list.add("Cup");
		list.add("Plate");

		System.out.println(list);


		boolean knife = list.remove("Knife");
		System.out.println(list);

		for (String str : list)
			System.out.println(str);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object objects = itr.next();
			System.out.println(objects + " ");
		}

	}
}


