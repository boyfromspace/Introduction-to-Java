import java.util.Scanner;
public class Task9{
	static public void main(String[] args){
		Scanner read = new Scanner(System.in);
		int a,b;
		System.out.println("Type in integer \"a\".");
		a=read.nextInt();
		System.out.println("Type in integer \"b\".");
		b=read.nextInt();

		if(a>b){
			System.out.println("Number a is greater then b.");
		}
		else if(a<b){
			System.out.println("Number b is greater then a.");
		}
		else{
			System.out.println("Number a is the same as b.");
		}
	}
}