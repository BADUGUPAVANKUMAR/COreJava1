package Interfacedemo;

interface electronics{
	void module() ;
	void cost();
	}
abstract class mobile implements electronics{
	  void ram() { 
		  System.out.println(" the mobiles ram minimum 4gb ram used" );
	  }
  } 
   abstract class laptop implements electronics{
		  void genaration() { 
			  System.out.println(" the laptop genaration is 11th genaration " );
		  }
	  } 
   class realme extends mobile{

	@Override
	public void module() {
		super.ram();
		 System.out.println("mobile module is  realme 3pro " );
	}
@Override
	public void cost() {
		 System.out.println("mobile cost is 16000/ " );
	}
	   
   }
   class redmi extends mobile{

	@Override
	public void module() {
		
		 System.out.println("\"mobile module is  readmi 6pro " );
	}

	@Override
	public void cost() {
		 System.out.println("mobile cost is 18000/ " );
		
	}
	   
   }
   class dell extends laptop {

	@Override
	public void module() { 
        super.genaration();
		System.out.println("laptop module is  dell i5 " );
		
	}

	@Override
	public void cost() {
		 System.out.println("laptop genaration is 11th genaration " );
			
	}
	   
   }
   class hp extends laptop {

	@Override
	public void module() {
		System.out.println("laptop module is  dell i3 " );
		
	}

	@Override
	public void cost() {
		 System.out.println("laptop genaration is 8th genaration " );
		
	}
	   
   }
public class Interface1 {

	public static void main(String[] args) {
		
         electronics obj;
         System.out.println("-------REALME--details--------");
         obj = new realme ();
         obj.module();
         obj.cost();
         System.out.println("-------REDMI--details--------");
         obj = new redmi ();
         obj.module();
         obj.cost();
         System.out.println("-------DELL--details--------");
         obj = new dell ();
         obj.module();
         obj.cost();
         System.out.println("-------HP--details--------");
         obj = new hp ();
         obj.module();
         obj.cost();
         
	}

}

