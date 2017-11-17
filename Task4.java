import java.math.BigInteger;

public class Task4{
	public static void main(String[] args){
		BigInteger a = new BigInteger("12345678901234567890");
		BigInteger b = new BigInteger("987654321987654321");
		BigInteger add,sub,multi,div,power;

		add=a.add(b);
		sub=a.subtract(b);
		multi=a.multiply(b);
		div=a.divide(b);


		System.out.println("a+b = "+add.toString());
		System.out.println("a-b = "+sub.toString());
		System.out.println("a*b = "+multi.toString());
		System.out.println("a/b = "+div.toString());
	}
}