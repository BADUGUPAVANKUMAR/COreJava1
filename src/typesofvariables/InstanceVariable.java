package typesofvariables;

class Instance{
	String animal;
	int no;
	short age;
	long killed;
    char grade1;
    char grade2;
    short num1;
    static String name;
  }
public class InstanceVariable {

	public static void main(String[] args) {
		Instance obj = new Instance();
		obj.animal="LION";
		obj.no=5;
		obj.age=8;
		obj.killed=23;
		obj.grade1='A';
		obj.grade2='B';
		obj.num1=10;
		Instance.name="ZOO";
		System.out.println(Instance.name +" PARK");
		System.out.println("--------------------");
		System.out.println("Animal name is "+obj.animal);
		System.out.println(obj.no +" Lions are in this zoo park");
		System.out.println("big lion age is "+obj.age);
		System.out.println("big male lion grade is :" +obj.grade1);
		System.out.println("that A grade Lion killed " +obj.killed +" people");
		System.out.println("big female lion grde is :" +obj.grade2);
		System.out.println("that B grade lion killed " +obj.num1 +" people");
		}
	    }
