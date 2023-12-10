package JavaClasses;
//classes and attributes

public class ClassesAndAttributes { //Using multipule classes 
	
	public static void main(String[] args) {
		
	
    Student info = new Student();{ //arpita :- object or instance
    	info.id = 1;
    	info.name = "Arpita";
    	info.age = 16;
    	
    	System.out.println(info.name + "is " + info.age + " years old");
    }
    
    Student memo = new Student();{ //also you write the multipule objects at a time
     memo.id =2;
     memo.name = "sai";
     memo.age = 15;
     
     //you can add multipule attributes at a time
     System.out.println(memo.id + " " +  memo.name + " "  + memo.age);}

	 Student marks = new Student ();
	 System.out.println(marks.x);
     
	//Modify attributes
	
	 Student modifymarks = new Student ();
	 modifymarks.x = 10;
	 System.out.println(modifymarks.x);
	  // if youn don't want change the attributes value then use the final 
	 //example
	 
	 //modifymarks.z = 30;
	 System.out.println(modifymarks.z);//if i want to change the value then error is showing
	
	}
}