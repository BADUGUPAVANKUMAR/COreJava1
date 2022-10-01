package Variables;

class pavan {
	String name;
	String collegename;
	String collegecode;
	   byte rollno;
    	int number; 
    	long hallticketno;
    	float attendence;
    	double overallattendence;
}  	
class student {
	    int marks;
	    String results;
}
public class DataTypes{

	public static void main(String[] args) {

		pavan vijay = new pavan();
		vijay.name = "badugu pavankumar";
		vijay.collegename = "mist";
		vijay.collegecode = "motk";
		vijay.rollno = 32;
		vijay. number = 767194201;
		vijay.hallticketno = 19650302;
		vijay.attendence = 85.5f;
		vijay.overallattendence = 75.555;
		System.out.println(vijay.name);
		System.out.println(vijay.collegename);
		System.out.println(vijay.collegecode);
		System.out.println(vijay.rollno);
		System.out.println(vijay. number);
		System.out.println(vijay.hallticketno);
		System.out.println(vijay.attendence);
		System.out.println(vijay.overallattendence);
	
		student akhil = new student();
			akhil.marks=75;
		    akhil.results="pass";
		    System.out.println("mar="+akhil.marks);
		    System.out.println("results="+akhil.results);
	}	
}


