package datastructure;

import databases.ConnectToMongoDB;

import java.util.*;

public class UseMap {

	public static <ConnectToMySql> void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		List<String> brands= new ArrayList<String>();
		brands.add("Lamborghini");
		brands.add("Audi");
		brands.add("BMW");
		brands.add("Porsche");


		Map<String, List<String>> Brands = new HashMap<String, List<String>>();
		Brands.put("Best Car Brands",brands);

		System.out.println("Printing DATA");
		for(Map.Entry<String,List<String>> printMenu: Brands.entrySet()){
			System.out.println(printMenu.getKey()+" "+printMenu.getValue());
		}

	}

}
