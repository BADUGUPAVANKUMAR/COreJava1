package Collection;


class Alchohalstore {
    	void brand() {
    	System.out.println("type of breand is bp");	
    	}
    	void cost() {
    		System.out.println("the bleande pride cost is 750/-");	
    	}
    }
class kf extends Alchohalstore{
    	 void brand() {
    		
    		 System.out.println("kingfisher light beer" );
    }
    	 void cost() {
    		 System.out.println("180/- " );
    }
       }
 class classbarg extends Alchohalstore{
    	public void brand() {
    		 System.out.println("classburg is also a light beer " );
    	}
    	public void cost() {
    		 System.out.println(" 160/- " );	
    	}   
       }
 class bp extends Alchohalstore {
    	public void brand() { 
    		System.out.println("blenders pride  " );	
    	}
    	public void cost() {
    		 System.out.println(" 750ml is  1400/- " );		
    	}   
       }
class genaration extends Alchohalstore {
    	public void brand() {
    		System.out.println("genaration " );	
    	}
    	public void cost() {
    		 System.out.println("750ml is 1150/- " );	
    	}
}
 class Alchohol{
    	Alchohalstore getbrand(String Brandname) {
    		if(Brandname.equals("kf"))
			return new kf();
    		else if(Brandname.equals("classberg"))
			return new classbarg();
    		else
			return null;
    		
    	}
    }
    
public class FectoryDmo {

	public static void main(String[] args) {
		Alchohol hf = new Alchohol();
		Alchohalstore h = hf.getbrand("classberg");
		h.brand();
		h.cost();
		
		

	}

}
