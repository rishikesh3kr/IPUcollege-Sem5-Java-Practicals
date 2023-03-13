import java.util.Scanner;

class work{
    int top,max=100;
    int a[]=new int[100];
    
    boolean isEmpty()
    {
        return(top<0);
    }

    work()
    {
        top=-1;
    }

    boolean push(int x)
    {
        if(top>=(max-1))
        {
            System.out.println(" Stack Overflow...");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(" "+x+" is pushed into stack.");
            return true;
        }
    }

    void pop()
    {
        if(top<0)
        {
            System.out.println(" Stack Underflow...");
        }
        else
        {
            int x=a[top--];
            System.out.println(" "+x+" is popped from the stack.");
        }
    }

    int peek()
    {
        if(top<0)
        {
            System.out.println(" Stack Underflow...");
            return 0;
        }
        else
        {
            int x=a[top];
            return x;
        }
    }
}

class Stack{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int phew;
        char a;
        work neo=new work();

        do{
            System.out.println("-----------STACK-----------\nEnter your choice\n 1. For push\n 2. For pop\n 3. For Display");
            int x=in.nextInt();
            switch(x)
            {
                case 1:
                    {   
                        System.out.print("\n'Pushing into Stack'\n Enter number to push into stack - ");
                        phew=in.nextInt();
                        neo.push(phew);
                        break;
                    }
                case 2:
                    {
                        System.out.println("\n'Popping from the Stack'");
                        neo.pop();
                        break;
                    }
                case 3:
                    {
                        System.out.println("\n'Displaying the Stack'\n The elements of the Stack are :");
                        for(int i=0;i<=neo.top;i++)
                        {
                            System.out.println(" "+neo.a[i]);
                        }
                        break;
                    }
                default:
                    {
                        System.out.println("Invalid Input!\n");
                    }
            }
            System.out.println("Continue(Y/N)");
            a = in.next().charAt(0);} while (a=='Y' || a=='y');
        in.close();
    }
}