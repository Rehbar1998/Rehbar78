package day9_classes;

import java.util.Scanner;
// Product.class 
//blue print object 
//class doesnot contain any data 
public class Product {

	String name;
	int price;
	int qty;
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter product name");
		name= s.next();
		System.out.println("enter product price");
		price= s.nextInt();
		System.out.println("enter product qty");
		qty= s.nextInt();
		

	}
	void show()
	{
		System.out.println(name + "  "+ price +  "   "+ qty );
	}
}
