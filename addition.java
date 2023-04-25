package myfirstprogram;
import java.util.Scanner;
public class HelloWorld{
	public static void main(String args[]) {
		int a;
		int b;
		int res;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter a :");
		a = add.nextInt();
		System.out.println("Enter b :");
		b = add.nextInt();
		res = a + b;
		System.out.print("Addition of two numbers : " + res);
		
	}
}	
