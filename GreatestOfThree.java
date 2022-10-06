import java.util.*;
class GreatestOfThree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the three numbers one by one - ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println(a+" is the greatest number.");
			}
			else
			{
				System.out.println(c+" is the greatest number.");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is the greatest number.");
			}
			else
			{
				System.out.println(c+" is the greatest number.");
			}
		}
		sc.close();
	}
}
