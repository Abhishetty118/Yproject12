package JavaClasses;
/*
 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
 */
public class Constructors {

	int x;
	
	
	public Constructors() { //class constructor for the Constructors class
		x = 5;
		
		
	}
	public static void main(String[] args) {
		Constructors myobj = new Constructors();
		System.out.println(myobj.x);
		
		
	}
	

	
	 
		
	
}
/*Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself,
 Java creates one for you. However, then you are not able to set initial values for object attributes.
 */


  //Constructure parameter

     