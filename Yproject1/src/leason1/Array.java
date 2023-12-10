package leason1;
/*
 * it can store mutipule values at a time but same they have same kind of data type
 * we use [] for declear the array
 * index of an array is start from 0
 * 
 * 
 */
public class Array {
   public static void main(String[] args) {
	 int[] array1 = {1,2,3,4,5,6}; //it is a correct method or
	
	 // int array2[] = {8,9,7,6,5,4};//not preferd
	 
	 /*there are 3 correct ways to declear an array
	  * 1. int[] A = new int [9]
	  * 2. int [] a = {1,2,3,4,5}
	  * 3. int[] A = new int[]{1,2,3,4,5}
	  */
	 System.out.println(array1[3]);
	 
	 //while loop with array
	 
	 int index = 0;//(initialisation)//here initioalisation & decleration will be declear out side the loop
	 while(index<6)//(expresion)
	 {
		 System.out.println(array1[index]);
	  index++;//(increment)
	 }
	 //for loop with array
	 // in for loop decleration will be declear inside the loop
	 System.out.println("-------------");
	 
	 for (int index1 = 1; index1 <6;index1++)
	 {
		 System.out.println(array1[index1]);
		
	 }System.out.println("____end____");
	 
	 
	 //another way for for loop in array
	 
	 for (int M2: array1) { 
	 
		 System.out.println(M2);
	 }
	 
	 
	 
	 
	 
	 
	 
} 
}
