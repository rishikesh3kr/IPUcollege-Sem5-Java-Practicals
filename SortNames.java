import java.util.*;

class SortNames
{
    public static void main(String a[])
    {
        System.out.print("\nSorting Names Alphabetically\n\nEnter the number of names: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names one by one : ");
       // in.next();

        for(int i = 0 ; i < n ; i++){
            System.out.print((i+1)+". ");
            names[i] = in.next();
        }
        in.close();

        //Arrays.sort(names);
        String temp;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("\nThe names sorted alphabetically in ascending order are :  ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print((i+1) + ". " + names[i] + "\n");
        }
    }
}