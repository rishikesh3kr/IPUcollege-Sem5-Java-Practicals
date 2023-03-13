import java.util.Scanner;

public class Constructor {
        int a,b,c;
        
        Constructor()
        {
            System.out.println("Default Constructor in use...");
            a=1;
            b=2;
            c=3;
        }

        Constructor(int x, int y, int z)
        {
            System.out.println("Parametrized Constructor in use...");
            a=x;
            b=y;
            c=z;
        }

        Constructor(Constructor copy)
        {
            System.out.println("Copy Constructor in use...");
            a=copy.a+10;
            b=copy.b+10;
            c=copy.c+10;
        }

        void show()
        {
            System.out.println("Values of a, b and c are "+a+", "+b+" and "+c+"\n");
        }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Constructors in Java...\n");
        Constructor c1=new Constructor();
        c1.show();

        System.out.println("Enter three values to pass as parameters for a constructor - ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        Constructor c2=new Constructor(a,b,c);
        c2.show();
        in.close();

        Constructor c3=new Constructor(c2);
        c3.show();
    }
}
