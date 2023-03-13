import java.util.*;

class ex1 extends ArithmeticException
{
    ex1(String s)
    {
        //super(s);
        System.out.println("Unchecked bana dia");
    }
}
class Exception
{
    static void valid(int i) throws ex1
    {
        i=5/1;
        if(i!=0)
        {
            throw new ex1("Unchecked marked");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        try{
            valid(10);
            int[] s=new int[100];
            System.out.println(s[100]);

        }
        catch(ex1 j)
        {
            System.out.println("Exception caught is "+j);
        }
        catch(IndexOutOfBoundsException e)
        {
            //System.out.println("Exception caught is "+e);
            System.out.println(e.getMessage());
            e.getMessage();
        }

        System.out.println("Executed try and catch");
    }
}