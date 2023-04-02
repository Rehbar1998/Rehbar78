package day9_classes;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 
		System.out.println("1 add product ");
		System.out.println("2 add Staff");
		System.out.println("enter choice");
		int choice= s.nextInt();
		if(choice==1)
		  {
			Product p= new Product();
			p.input();
			p.show();
		  }
		else 
			{
			Staff sf= new Staff();
			sf.input();
			sf.show();
			}
		
		

	}

}
