package Abstractdemo;
class University{
	void notification() {
		System.out.println("notification");
		System.out.println("external lobs date from: o7/07/2022 to 10/07/2022");
	}
    class Department {
   	  void prepare() {
   		  System.out.println("mechanical branch conducting a extrnal lobs");
   	  }
    }
}
public class Memberinnerclass {

	public static void main(String[] args) {
		university p = new university();
		p.notification();
		University.Department a = p.new Department();
	     a.prepare();
	}

}
