package userinputusingjava;

 import java.util.Scanner;//importing the scanner class 
public class MyClass {
  
	public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner (System.in); //for importing we use the system.in
	  System.out.println("Enter some number"); 
   int user_input_number = scan.nextInt();
	
	System.out.println("the enterd value is");
	System.out.print(user_input_number);
	
	
	@SuppressWarnings("resource")
	Scanner scan1 = new Scanner (System.in);
	System.out.println("enter some decimal value");
	double d = scan1.nextDouble();
	System.out.println(d);
	
	
	@SuppressWarnings("resource")
	Scanner scan2 = new Scanner (System.in);
	System.out.println("enter some string");
	String S1 = scan2.nextLine();
	System.out.println(S1);
	
	@SuppressWarnings("resource")
	Scanner scan3 = new Scanner (System.in);
	System.out.println("write somethin"); 
	String s2 = scan3.nextLine();
	System.out.println(s2);

	}
}