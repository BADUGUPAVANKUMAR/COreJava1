package Collection;

class Electronics {
	void brand() {
	System.out.println("type of breand is bp");	
	}
	void cost() {
		System.out.println("the bleande pride cost is 750/-");	
	}
}
class realme extends Electronics{
	 void brand() {
		
		 System.out.println("realme mobile is a good product" );
}
	 void cost() {
		 System.out.println("180/- " );
}
   }
class Redmi extends Electronics{
	public void brand() {
		 System.out.println("classburg is also a light beer " );
	}
	public void cost() {
		 System.out.println(" 160/- " );	
	}   
   }
class dell extends Electronics {
	public void brand() { 
		System.out.println("blenders pride  " );	
	}
	public void cost() {
		 System.out.println(" 750ml is  1400/- " );		
	}   
   }
class hp extends Electronics {
	public void brand() {
		System.out.println("genaration " );	
	}
	public void cost() {
		 System.out.println("750ml is 1150/- " );	
	}
}
class wines{
	 static Electronics getbrand(String Brandname) {
		if(Brandname.equals("re`alme"))
		return new realme();
		else if(Brandname.equals("dell"))
		return new dell();
		else
		return null;
		
	}
}

public class StaticFactory{

public static void main(String[] args) {
	
	Electronics h = wines.getbrand("realme");
	h.brand();
	h.cost();
	
	

}

}
