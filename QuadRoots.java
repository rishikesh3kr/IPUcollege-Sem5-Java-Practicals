import java.util.Scanner;

class QuadEq
{
    double a,b,c,d,r1,r2,i;

    QuadEq()
    {
        a=0;
        b=0;
        c=0;
        r1=0;
        r2=0;
        d=0;
    }

    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\nFor a quadratic equation of the type ax^2+bx+c, enter the constants a,b and c -");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
    }
    
    void output()
    {
        System.out.println("\nThe quadratic equation entered is "+a+"x^2+"+b+"x+"+c);
    }

    void CalRoots()
    {
        d=b*b-4*a*c;

        if(d>0)
        {
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
        }
        else if(d==0)
        {
            r1=-b/(2*a);
            r2=r1;
        }
        else
        {
            i=(Math.sqrt(-d))/(2*a);
            r1=-b/(2*a);
        }
    }

    void DispRoots()
    {
        if(d>=0)
        {
            System.out.println("\nThe roots of the quadratic equation are "+r1+" and "+r2);
        }
        else
        {
            System.out.println("\nThe roots of the quadratic equation are "+r1+"+"+i+"i and "+r1+"-"+i+"i"); 
        }
    }
}

class QuadRoots
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch=1;

        System.out.print("Roots of a Quadratic Equation...\n");
        QuadEq q1=new QuadEq();

        do
        {
            q1.input();
            q1.output();
            q1.CalRoots();
            q1.DispRoots();

            System.out.print("Press 1 to repeat and any other number to exit - ");
            ch=in.nextInt();
        }while(ch==1);
        in.close();
    }
}