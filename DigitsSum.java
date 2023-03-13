import java.util.Scanner;
public class DigitsSum {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long number,sum;
        int i=0;
        long[] a=new long[100];
        sum=0;

        System.out.print("Enter the number - ");
        number=in.nextLong();
        in.close();

        while(number!=0)
        {
            a[i]=number%10;
            number=number/10;
            i++;
        }

        for(int j=0;j<i;j++)
        {
            sum=sum+a[j];
        }
        
        System.out.print("\nThe sum of the digits of the number is "+sum);
    }
}
