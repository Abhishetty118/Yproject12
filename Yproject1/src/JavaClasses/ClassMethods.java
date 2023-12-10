package JavaClasses;

public class ClassMethods {
   static void mymethod() { //method
	   System.out.println("hello youtube"); //call this method in main method
	   
   }
   public static void main(String[] args) {
	mymethod(); //calling the method
	
	staticmethod(); //call static method
	
	ClassMethods myobj = new ClassMethods();
	myobj.publicmethod();
	
	ClassMethods mybike = new ClassMethods();
	mybike.Avenger(); //call the method()

	mybike.speed(150); // call the speed() method
	
}

//static vs public
   
   //static method
   static void staticmethod() { 
	   System.out.println("static method can be called without creating object");
   }
   
   //public method
   public void publicmethod() {
	   System.out.println("public method must be called by creating objects");
   }
   
//Access Methods With an Object
   
   public void Avenger() {
	   System.out.println("The bike is going as fast as it can!");
	   
   }

   public void speed(int maxspeed) {
	   System.out.println("max speed is: " + maxspeed);
   }
  
   
   //same you can use multiple classes also 
















}
 
   