package leason1;
//String is seqence of characters or is a character array
public class JavaString {

	public static void main(String[] args) {
		String mystring = "Good Evening";
		int lenght = mystring.length();
		//for find the lenght of the string
		String LoCase = mystring.toLowerCase();//for lower case
		String upcase = mystring.toUpperCase();//for upper case
		String concat = ("Hello " + " Good Evening");//when you use the + symbol it is known as conctination
		//this will be add the two words in one sentence
	
		System.out.println(mystring);
		System.out.println(lenght);
	System.out.println(LoCase);
	System.out.println(upcase);
	System.out.println(concat);
	
	//if we want to replace any character or strings
	
	System.out.println(mystring.replace('o', 'a'));
	System.out.println(mystring.replaceFirst("Good", "Bad"));
	System.out.println(mystring.replaceAll("Evening", "Morning"));
	
	//for find out the index no.
	
	System.out.println(mystring.indexOf('o'));
	}
}
