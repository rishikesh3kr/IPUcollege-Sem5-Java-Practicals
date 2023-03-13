import java.util.Scanner;

class QueueManage{
    int queue[]=new int[100];
    int n=100,front=-1,rear=-1,x;
    Scanner in=new Scanner(System.in);

    void insert()
    {
        if(rear==n-1)
        {
            System.out.println("Queue Overflow...");
        }
        else
        {
            if(front==-1)
            front=0;

            System.out.print("Enter the element you want to insert - ");
            x=in.nextInt();
            rear++;
            queue[rear]=x;
            int z=rear+1;
            System.out.println(queue[rear]+" is entered at position "+z);
        }
    }

    void delete()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue Underflow...");   
        }
        else
        {
            System.out.println("Element deleted from queue is "+queue[front]);
            
            for(int i=0;i<rear;i++)
            {
                queue[i]=queue[i+1];
            }
            System.out.println("Elements remaining in queue is "+rear);

            rear--;
        }
    }

    void Display()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty!");
        }
        else
        {
            System.out.println("The elements of the queue are as follows - ");
            
            for(int i=front;i<=rear;i++)
            System.out.println(queue[i]);
        }
    }
}

class Queue
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=0;

        System.out.println("Queue in Java...");
        QueueManage q1=new QueueManage();

        while(a!=4)
        {
            System.out.println("\nEnter your choice from the list below :\n 1. Insert an element\n 2. Delete an element\n 3. Display all elements\n 4. Exit");
            a=in.nextInt();

            switch(a)
            {
                case 1: q1.insert();
                break;
                case 2: q1.delete();
                break;
                case 3: q1.Display();
                break;
                case 4: System.out.println("Exiting...");
                break;
                default: System.out.println("Invalid choice entered!");
            }
        }
        
        in.close();
    }
}