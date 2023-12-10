
package leason1;

public class W3schoolMethods {//this is a class
  static void abhignyaMethod() {//this is a method
	  System.out.println("practice makes man perfect"); // pre defined method
      System.out.println("we are happy together");
  }
      static void sai(String firstN) {//parameters & arguments
    System.out.println(firstN);	 } 
    
     static void studentsinfo(String name,int sid,char division) {//multipul parameters
    	 System.out.println(name  + " " + sid+ " "  +  division);} // for space use + " " +
    	  
	public static void main(String[] args) {//this is a main method
		abhignyaMethod();//call the method into the main method
		sai("arpita");
		sai("rashni");
		sai("ashu");
		sai("shiva");
		
	    studentsinfo("dipa",1,'a');
	    studentsinfo("raj",2,'b');
	    studentsinfo("moni",3,'c');
	     
	    
	   if(4>2) {
		   System.out.println("saignya");
		   }
		   
		   if (50<80) {
			   System.out.println("it is true");
			   }
		   
	    int M = 60;
	    int N = 80;
	    if (M < N) {
	    	System.out.println("m is greter than n");
	    }
	    int X = 60;
	    int Y = 80; //if condition is true then printing the if statement
	    if (X >= Y) {
	    	System.out.println("happy");
	     } else { //if condition is false then printing the else statement
	    	 System.out.println("sad"); }
	    
	    int day = 8;
	    if (day<7) {
	    	System.out.println("hello");
	   } else if (day > 2) {
	    System.out.println("hey");
	} else {
		System.out.println("hi");}
	
	    
	//short-cut of if else statement
	int z = 30;
	String result = (z > 15) ? "happy hour." : "happy journey.";
	System.out.println(result);
	
	//Switch statement:
	 /*  Switch (expression){
	  * case x :
	  *  syso
	  *  break;
	  *  case y:
	  *  syso
	  *  break;
	  *  default:
	  * 
	  */
	
	int months = 12;
	switch (months) {
	case 1:
		System.out.println("jan");
	  break;
	case 2:
		System.out.println("feb");
	   break;
	case 3:
		System.out.println("mar");
	   break;
	case 4:
		System.out.println("apr");
	  break;
	case 5:
		System.out.println("may");
	  break;
	case 6:
		System.out.println("june");
	  break;
	case 7 :
		System.out.println("july");
	  break;
	case 8:
		System.out.println("aug");
	  break;
	case 9:
		System.out.println("sep");
	   break;
	case 10:
		System.out.println("oct");
	   break;
	case 11:
		System.out.println("nov");
	   break;
	case 12:
		System.out.println("dec");
	 break;
	} //switch statement
	
	
	
	//default keyword
	int xyz = 5;
	switch (xyz) {
	case 8:
		System.out.println("aug");
		  break;
		case 9:
			System.out.println("sep");
		   break;
		case 10:
			System.out.println("oct");
		   break;
		case 11:
			System.out.println("nov");
		   break;
	  default:
		  System.out.println("which is the correct statement");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
