class Fibonacci
{
	public static void main(String args[])
	{
		int i,n,fib,temp,a;
		n=20;
		fib=0;
		temp=1;
		System.out.println("The Fibonacci series upto "+n+"th number is \n"+fib);

		for(i=1;i<n;i++)
		{
			a=temp;
			temp=fib+temp;
			fib=a;
			System.out.println(fib+" ");
		}
	}
}
