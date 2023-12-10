package Accsessmodifier;

public class PublicModifier {
/*
 * Access levels
 * Modifier      class   package   subclass    world
 * 
 * Public         yes     yes       yes       yes
 * Protected      yes     yes       yes       no
 * No Modifier    yes     yes        no       no
 * Private        yes     no         no       no
 * 
 */
	
	
	
	
	/*
	 * Final keyword:-
	 *      
	 *      A final class cannot be subclassed
	 *      A final method cannot be overridden by subclasses
	 *      A final variable can only be intialized once
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PublicModifier fin = new PublicModifier();
		
	}
	
	public final int number;
	PublicModifier(){
		number = 10;
		System.out.println(number );
	}
}
