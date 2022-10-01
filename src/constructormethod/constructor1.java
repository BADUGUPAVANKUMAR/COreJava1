package constructormethod;

public class constructor1 {
	int id;
	String name1;
	char grade;
	constructor1(){
	
	}
	constructor1(int carno,String name,String Speed){
		System.out.println("my car no :"+carno);
		System.out.println("my car name is "+name);
		System.out.println("my car speed is "+Speed);
	}
	void B(int id, String name1, char grade) {
		this.id=id;
		this.name1=name1;
		this.grade=grade;
		System.out.println("my roll no is :"+id);
		System.out.println("my name is :"+name1);
		System.out.println("my grade is :"+grade);
		
	}

	public static void main(String[] args) {
		constructor1 obj=new constructor1(1234,"benz","200km per hour");
		obj.B(303,"vijay",'A');
		
	}

}
