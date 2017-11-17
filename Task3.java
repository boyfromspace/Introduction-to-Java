public class Task3{
	public static void main(String[] args){

		double a,b,c;
		a = 4;
		b = 5;
		c = 6;

		System.out.println((a+b)*c);
		System.out.println(a-b/c);
		a++;b++;c++;
		boolean assumption1 = (a+b)>c;
		boolean assumption2 = a==b;
		System.out.println(assumption1);
		System.out.println(assumption2);
	}
}