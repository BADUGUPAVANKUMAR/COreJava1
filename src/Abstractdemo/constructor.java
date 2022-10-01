package Abstractdemo;
abstract class Hospatal{
	abstract void icu();
	Hospatal(){
		System.out.println("ICU");
		System.out.println("icu is =intensive care units");
	}
	Hospatal(String GAS,String BED){
		System.out.println("ICU HAD "+GAS);
		System.out.println("ICU HAD "+BED);
	}
}
class nims extends Hospatal{
	void icu() {
		System.out.println("------------------------");
	}
	 nims (){
		 super();
	 }
	 nims (String GAS,String BED){
		 super(GAS,BED);
	 }
}
public class constructor {
	

	public static void main(String[] args) {
		nims p = new nims();
		p.icu();
		nims s = new nims("o2","bed");
		
	}

}
