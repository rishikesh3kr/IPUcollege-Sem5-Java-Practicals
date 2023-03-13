import java.util.Scanner;
public class Swap {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,swap;

        System.out.print("Enter the 1st number - ");
        a=in.nextInt();
        System.out.print("Enter the 2nd number - ");
        b=in.nextInt();
        in.close();

        swap=a;
        a=b;
        b=swap;

        System.out.println("\nAfter Swapping -\nThe 1st number is "+a+"\nThe 2nd number is "+b);
    }
}
