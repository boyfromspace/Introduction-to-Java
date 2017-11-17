public class Task1{
	public static void main(String[]args){

		int num1 = 2;
		int num2 = 3;
		 System.out.println(num1+num2);

		double num3,num4;
		num3 = 3.4;
		num4 = 5.8;
		System.out.println("a + b = "+(num1+num2));
		System.out.println("d + c = "+(num4+num3));

		String hey="Hey,";
		String how="how are You?";
		String hey_how=hey + how;
		System.out.println(hey_how);
		String hello = hey_how.substring(0,6)+ "student"; 
		/*substring gives us only characters from (x,y-1)
		 where x is the starting point and y is ending point*/
		System.out.println(hello);
	}
}