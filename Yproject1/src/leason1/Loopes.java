package leason1;

public class Loopes {

	public static void main(String[] args) {
		 int Grade = 80 ;
		 switch (Grade) {
		 case 92 :
			 System.out.println("Excellent");
			 break;
		 case 80:
			 System.out.println("very good");
		      break;
		 case 60:
			 System.out.println("good");
			  break;
		 default :
				 System.out.println("the grade is not defined");
		//if condition is not satisfied then default statment will be printed 
}
		 //switch statement without break
		int Grade1 = 90;
	switch (Grade1) {
	case 100:
	case 90:
	case 95:
		System.out.println("Excellent");
	}
		 //While loop syntax: while (){}
	 /*
	 * loop is a statement or peace of code which execute some block of code again and again until some condition is mate
	 *  
	 */
	int H = 0;
	 
	 while (H <= 10) 
	 {
		 System.out.println(H);
		 H++; //while statement will be print continuously
	 }
	 int H1 = 10;
	 while (H1 > 0) {
		 System.out.println(H1);
		 H1--;
	 }//here we write the while loop first then print
	 
	 //do while loop
	 int H2 = 0;
	 do {
		 System.out.println(H2); 
		 H2++;
	 }while (H2<=10);
	 /*
	  * differance btw while & do while loop
	  * while loop:-
	  *   while loop first evaluate and then excutes the statment
	  *   if the condition will be false then the statment will be not executed
	  *   
	  * do while:-  
	  *   even if condition is false then at list once it will be executed
	  *   in do while loop first executes the statement then evaluate 
	  *   
	  */
	 
	 
	}
}
