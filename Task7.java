import java.util.Scanner;

public class Task7{
	public static void main(String[] args){
		double a,b;

		Scanner read = new Scanner(System.in);

		a = read.nextDouble();
		b = read.nextDouble();


		System.out.println("Adding : a + b = " + (a+b));
		System.out.println("Substracting : a - b = " + (a-b));
		System.out.println("Multiplying : a * b = " + (a*b));
		System.out.println("Divideing : a / b = " + (a/b));	
	}
}