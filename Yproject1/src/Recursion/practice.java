package Recursion;

public class practice  {
public static int factorial (int N) {
	if (N <=1)
		return 1;
	else 
		return(N * factorial(N-1));
}
public static void main(String[] args) {
	System.out.println(factorial(5));  //N = 5*4*3*2*1
	
	System.out.println(sum (10));//sum = 10+9+8+7+6+5+4+3+2+1+0
}

public static int sum(int k) {
	if(k > 0) {
		return k + sum(k - 1);
	} else {
		return 0;
	}
}
}

//5! = 5*4*3*2*1 = 120 