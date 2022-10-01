package constructormethod;

import java.util.Scanner;
public class constructordemo {
	int no;
	String name;
	String company;
	char rating;
	float salary;
	constructordemo(){
	this.no=no;
	this.name=name;
	this.company=company;
	this.rating=rating;
	this.salary=salary;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("company name");
		String hotel=sc.next();
		System.out.println("enter the rating");
		char rating=sc.next().charAt(0);
		System.out.println("enter the salary");
		float salary=sc.nextFloat();
		
		constructordemo obj=new constructordemo();
	}

}
