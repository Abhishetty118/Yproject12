package leason1;

public class Methods {
	/*
	 * ##a method is a peace of code which execute some logic
	 * ##void means do not return anything
	 */
 public static void main(String[] args) {//main method
    	 
	 myfirstmethod(); //call the method in main method
     hey("abhignya");
     hey("arpita");
     hey("sakshi");
	 
	 ab(100,50,20);
     ab(30,50,40);
     ab(20,40,60);
     
     
     
     int M = result(30,50,60);//returning value
     System.out.println(M);//in return we print the value in main method
     int M1 = M * 5;
     System.out.println(M1);
     
 }
 public static void myfirstmethod() {
	 System.out.println("hey");
 }
//passing parameters and returning a value from a method
 
 
 
 public static void hey(String name) {
	 System.out.println("hello " + name);
 }
 public static void ab(int a,int b,int c) { //parameters passing
	 System.out.println(a+b+c);
 }
 //returning value
 //in return void is not used because void means do not return anything
 
 public static int result(int x, int y,int z) {
	 return (x+y+z);
 }
 
}
