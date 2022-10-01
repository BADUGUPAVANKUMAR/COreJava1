package methodoverriding;

class typesOfStores{
	String login(String Name, String name) {
		System.out.println("types of stores   "+Name);
		System.out.println(" name of the store    "+name );
		return "Please wait your profile is laoding";
	}
	String  Search( String Internship) {
		return "Matching Internships";
	}
}
class LinikdnDetails extends typesOfStores{
	String login(String Name, String name) {
		System.out.println("  ");
		System.out.println("types  "+Name);
		System.out.println("name of the store   "+name);
		return "genaralstore store are two tyeps : wholesale and retail";
	}
	String  Search( String Internship) {
		return "Matching Internships";
	}
}
public class stores{

	public static void main(String[] args) {
		typesOfStores kl = new typesOfStores();
		System.out.println(kl.login("sprots,automobile,alchohal,genaralstore", "sports"));
		System.out.println(kl.Search("Java developer"));
		kl=new LinikdnDetails();
		System.out.println(kl.login("sprots,automobile,alchohal,genaralstore", "genaralstore"));
		System.out.println(kl.Search("Java developer"));
	}
}
