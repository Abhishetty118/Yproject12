package Polymorphism;

public class MyClass {
	
public static void main(String[] args) {
	Bank B1 = new HDFCBank();
	Bank B2 = new ICICIBank();
	Bank B3 = new SBIBank();
	
	System.out.println(B1.getInterestRate());
	System.out.println(B2.getInterestRate());
	System.out.println(B3.getInterestRate());
}
}
