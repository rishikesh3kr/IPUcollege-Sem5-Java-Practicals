class Factorial
{
	public static void main(String args[])
	{
		int i,n,factorial;
		n=10;
		factorial=1;
	
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
			System.out.println("The factorial of "+i+" is "+factorial);
		}
	}
}
