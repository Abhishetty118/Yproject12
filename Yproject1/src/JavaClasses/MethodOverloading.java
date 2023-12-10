package JavaClasses;

public class MethodOverloading {
public static void main(String[] args) {
	System.out.println(Add(5,10));
	System.out.println(Add(2.54,6.54));
	//System.out.println(Add("hello","world"));
	
}

    public static int Add(int a,int b) {
     return (a+b);	
    }
    
    public static double Add(double a,double b) {
    	return (a+b);
    	
    //	public static String Add (String a , String b ) {
    //		return (a+b);
    	}
   
    }

