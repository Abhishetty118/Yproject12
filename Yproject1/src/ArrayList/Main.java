package ArrayList;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	int simple_array[] = new int[5];
	
	ArrayList<Integer> myList = new ArrayList<Integer>(5);
	 myList.add(1);
	 myList.add(5);
	 myList.add(3);
	 myList.add(25);
	 myList.add(93);
	 
	 for (Integer x : myList)
		 System.out.println(x);
	 
       System.out.println(myList.set(1, 100));
	 
	 System.out.println("size  = " + myList.size()); //for size
    
	 System.out.println(myList.remove(2));//for removing
	
	 for (Integer x : myList)
		 System.out.println(x);
	 
     
}
}
