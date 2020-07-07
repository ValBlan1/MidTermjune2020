package algorithm;


import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.Random;

import static java.sql.DriverManager.getConnection;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {


	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */


	public static void main(String[] args) throws Exception {


		int[] num = new int[10];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();



		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("SELECTION SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		int n = num.length;
		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
		//List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		//printValue(numbers);
		//randomize (num, n);


		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("INSERTION SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		Sort.printSortedArray(num);


		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("BUBBLE SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + bubbleSortExecutionTime + " milli sec");
		Sort.printSortedArray(num);


		//By following above, Continue for rest of the Sorting Algorithm....

		//Merge Sort
		algo.MergeSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("MERGE SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		Sort.printSortedArray(num);


		try {
			//Quick Sort

			algo.quickSort(num, findLow(num), findHigh(num));
			long quickSortExecutionTime = algo.executionTime;
			System.out.println("QUICK SORT");
			System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		//	connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");Sort.printSortedArray(num);
		} catch (Exception ex) {
			ex.printStackTrace();

		}


		//Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("HEAP SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "Heap_sort", "SortingNumbers");
		Sort.printSortedArray(num);


		//Bucket Sort
		algo.bucketSort(num);

		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("BUCKET SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		Sort.printSortedArray(num);


		//Shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("SHELL SORT");
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "Shell_sort", "SortingNumbers");
		Sort.printSortedArray(num);


		//Come to conclusion about which Sorting Algo is better in given data set.
	}

	public static int findLow(int[] array){
		int low = array[0];
		for(int n: array){
			if(array[n] < low){
				low = array[n];
			}
		}
		return low;
	}

	public static int findHigh(int[] array){
		int high = array[0];
		for(int n: array){
			if(array[n] > high){
				high = array[n];
			}
		}
		return high;
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();

		for (int i = n-1; i > 0; i++) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}