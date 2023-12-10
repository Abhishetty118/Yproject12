package JavaClasses;

public class ConstructureParameter {

	int modeyear;
	String modename;
	
	public ConstructureParameter(int year,String name) {
		modeyear = year;
		modename = name;
		
	}
	
	public static void main(String[] args) {
		
		ConstructureParameter myinfo = new ConstructureParameter(1997,"abhi" );
		 
		System.out.println(myinfo.modename + " " + myinfo.modeyear);
			
		}
		
	}
	
	
	
	

 

