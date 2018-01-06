import java.util.*;
import java.math.*;
class Big
{
	public static void main(String[]args)
	{
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	BigInteger fact=BigInteger.valueOf(1);
	for(int i=1;i<=n;i++)
	fact=fact.multiply(BigInteger.valueOf(i));
	System.out.print(fact);
	}
}
	