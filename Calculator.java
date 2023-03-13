import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,num1,num2,ch,sum,dif,pro,div,mod;
        i=0;
    while(i==0)
    {    
        System.out.println("Enter two numbers -");
        num1=in.nextInt();
        num2=in.nextInt();
        i=1;
    while(i==1)
    {
        System.out.println("\nEnter your choice of operation : \n 1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division\n 5. Mod");
        ch=in.nextInt();

        if(ch==1)
        {
            sum=num1+num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
        }
        else if(ch==2)
        {
            dif=num1-num2;
            System.out.println("The difference between "+num1+" and "+num2+" is "+dif);
        }
        else if(ch==3)
        {
            pro=num1*num2;
            System.out.println("The product of "+num1+" and "+num2+" is "+pro);
        }
        else if(ch==4)
        {
            div=num1/num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+div);
        }
        else if(ch==5)
        {
            mod=num1%num2;
            System.out.println("The sum of "+num1+" and "+num2+" is "+mod);
        }
        else
        {
            System.out.println("Invalid output");
        }

        System.out.println("Press '0' to start over, '1' to repeat the operation on the same set of numbers and any other number to exit - ");
        i=in.nextInt();
    }
    System.out.print("\n\n");
    }
        in.close();
    }
    
}
