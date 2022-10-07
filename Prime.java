import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int prime,i,j,k,check;
        j=1;

        while(j==1)
        {
            System.out.print("Enter the number upto which you want to print all the Prime Numbers - ");
            prime=in.nextInt();

            for(i=2;i<=prime;i++)
            {
                check=0;
                
                for(k=2;k<i;k++)
                {
                    if(i%k==0)
                    {
                        check=1;
                    }
                }

                if(check==0)
                {
                    System.out.println(i+" is a Prime Number.");
                }
            }
            System.out.print("Press 1 to repeat and any other number to exit - ");
            j=in.nextInt();
        }
        in.close();
    }
}
