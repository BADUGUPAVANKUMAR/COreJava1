package SUPERKEYWORD;

class A {
	void company() {
		System.out.println("it is a good company");
	}
	void review() {
		System.out.println("company review exellent");
	}
	void employee() {
		System.out.println("my details are:");
	}
    }
class B extends A{
	B(){
		super.company();
		super.review();
		super.employee();
	}
	void company1() {
		int id=303;
		String name="vijay";
		String company="IT";
		float salary=40000;
		System.out.println("id is "+id);
		System.out.println("employee name "+name);
		System.out.println("my company name is : "+company);
		System.out.println("salary is "+salary);
	}
    }
public class SuperDemo {

	public static void main(String[] args) {
		B obj=new B();
		obj.company1();

	}

}
