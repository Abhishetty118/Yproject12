package leason1;

public class MathandJavaOperators {
   //Arithmetic operator
	public static void main(String[] args) {
	  int x,y,answer;
	  x = 20;
	  y = 30;
	  answer = x + y;
		
		System.out.println(answer);
		System.out.println("Answer = " + answer); //concatunation
		
		answer = x * y;
		System.out.println(answer);
		
		x = 60;
		y = 20;
		answer = x / y;
		System.out.println(x/y);
		
		double a,b,ans;
		
		a = 40;
		b = 12;
		ans = a/b;
		System.out.println(ans);
		
		ans = a % b;
		System.out.println(ans);
		
		answer = x % y ;
		System.out.println(answer);
		
	//increment operators
		
		int x1 = 10;
		x1++;  //(x1 = x1 + 1) increment by 1
		System.out.println(x1);
		
	//postincrement operator	
		
		int x2 = 12;
		System.out.println(x2++);//this operation will first print your value then increment the value
		System.out.println(x2);
		
		//preincrement operator
		
		int x3 = 10;
		System.out.println(++x3);//first increment the value then print
		System.out.println(x3);
		
 //Assignment operator	
		
		int S = 10;
	S += 5; // S = S + 5
		System.out.println(S); //15
		
		int S1 = 10;
		S1 *= 5; // s1 = s1 * 5
		System.out.println(S1);
		
		int S2 = 50;
		S2 /= 5;
		System.out.println(S2);
		
		S2 %= 2;
		System.out.println(S2);
		
		int S3 = 10;
		S3 >>= 2;
		System.out.println(S3);
		
		S3 -= 1;
		System.out.println(S3);
		
		//comparision operator with if else statement
		
		int M = 10;
		 if(M == 10) { //this operator cheks the equality ( ==, != , < ,> , >= , <= )
			 System.out.println("true");
	 } 
		 else 
			 System.out.println("false");
     if(M != 40) {
    	 System.out.println("hello");
     }	 
     else
    	 System.out.println("bye"); // < ,> , >= , <=
    		 
     //logical operator ( && and , || , or ! :- reverse the result)
 
     int D = 40;
     int D1 = 60;
      if ((D >= 20) && (D1 >= 50)) { // here all the conditions are satisfied
    	  System.out.println("if condition is true");
      } 
      else { System.out.println("condition is false");
      }
	
	if ((D <= 20) || (D1 >= 50)) { // any one condition will be satisfies
		System.out.println("good");
	}
	else {
		System.out.println("bad");
	}
	System.out.println((D >= 20) && (D1 >= 50));
	
	}
}
