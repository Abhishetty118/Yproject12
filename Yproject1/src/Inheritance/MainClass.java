package Inheritance;

public class MainClass {
public static void main(String[] args) {
	Rectangle rec = new Rectangle();
	Triangle tri = new Triangle();
	
	rec.set_value(10, 10);
    tri.set_value(10,10);
    
    System.out.println(rec.area());
    System.out.println(tri.area());
}
}
