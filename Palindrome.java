import java.util.*;

class Palindrome {
    public static void main(String a[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\nPalindrome Check \n");

        String original , reverse = "";
        System.out.print("Enter your String : ");
        original = in.nextLine();
        in.close();

        int n = original.length();

        for(int i = n-1 ; i >= 0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse))
        {
            System.out.println("\nIt is a Palindrome String.");
        }
        else
        {
            System.out.println("\nIt is not a Palindrome String.");
        }

    }
}