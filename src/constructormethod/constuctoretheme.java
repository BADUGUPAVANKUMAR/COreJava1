package constructormethod;

public class constuctoretheme {
	class  Linkdn1{
		String Login_Name;
		String Login_Password;
		
		Linkdn1(String Name, String password){
			this.Login_Name=Name;
			this.Login_Password=password;
			System.out.println("Please wait your profile is loading");
		}
		Linkdn1(String internship){
			System.out.println("Results of your search");
		}
	}
	public class Consrtructor_In_Linkdn_Theme extends Linkdn1{
		Consrtructor_In_Linkdn_Theme(String Name, String password){
			super("Surendra","Sonu@263");	
		}
		Consrtructor_In_Linkdn_Theme(String internship ){
			super("Java Developer");
		}
		public static void main(String[] args) {
			Consrtructor_In_Linkdn_Theme Serach2 = new Consrtructor_In_Linkdn_Theme("Surendra","Sonu@263");
			Consrtructor_In_Linkdn_Theme Serach3 = new Consrtructor_In_Linkdn_Theme("Java Developer");
			
			
		}

	}

