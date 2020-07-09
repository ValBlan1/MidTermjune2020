package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};

        Sort sort = new Sort();
        sort.selectionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        //String value = "i am waiting";
        //Assert.assertEquals("i am waiting...",value);
        //Now implement Unit test for rest of the soring algorithm...................below

        int [] unSortedArray1 = {6,9,2,5,1,0,4};
        int [] sortedArray1 =   {0,1,2,4,5,6,9};
        sort.insertionSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "Insertion sort array is not unsorted");
        }catch (Exception ex){
            ex.getMessage();
        }
        int [] unSortedArray2 = {6,9,2,5,1,0,4};
        int [] sortedArray2 =   {0,1,2,4,5,6,9};
        sort.bubbleSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray,unSortedArray, "bubble sort array is not sorted" );
        }catch (Exception ex){
            ex.getMessage();
        }
        int [] unSortedArray3 = {6,9,2,5,1,0,4};
        int [] sortedArray3 =   {0,1,2,4,5,6,9};
        sort.mergeSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, "merge sort array is not sorted");
        }catch (Exception ex){
            ex.getMessage();
        }
        int [] unSortedArray4 = {6,9,2,5,1,0,4};
        int [] sortedArray4 =   {0,1,2,4,5,6,9};
        sort.heapSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray," heap sort array is not sorted");
        }catch (Exception ex) {
            ex.getMessage();
        }
        int [] unSortedArray5 = {6,9,2,5,1,0,4};
        int [] sortedArray5 =   {0,1,2,4,5,6,9};
        sort.bucketSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, " bucket sort array is not sorted");
        }catch (Exception ex) {
            ex.getMessage();
        }
        int [] unSortedArray6 = {6,9,2,5,1,0,4};
        int [] sortedArray6 =   {0,1,2,4,5,6,9};
        sort.getMax(unSortedArray);
        try{
            Assert.assertEquals(unSortedArray, sortedArray, " getMax sort array is not sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        int [] unSortedArray7 = {6,9,2,5,1,0,4};
        int [] sortedArray7 =   {0,1,2,4,5,6,9};
        sort.shellSort(unSortedArray);
        try{
            Assert.assertEquals(sortedArray, unSortedArray, " shell sort Array is not sorted");
        }catch(Exception ex){
            ex.getMessage();
                }

            }
        }

