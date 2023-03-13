import java.util.*;

class Student
{
    int n,i,total;
    int[] rno=new int[100];
    String[] Name=new String[100];
    int[] marks=new int[100];
    Scanner in=new Scanner(System.in);
    float[] percentage=new float[100];
    char[] Grade=new char[100];

    Student()
    {
        n=1;
        total=100;
    }

    Student(int m, int t)
    {
        n=m;
        total=t;
    }

    void input()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the details of Student "+(i+1)+" :");
            System.out.print("Roll No - ");
            rno[i]=in.nextInt();
            System.out.print("Name - ");
            Name[i]=in.next();
            System.out.print("Marks - ");
            marks[i]=in.nextInt();
            AssignGrade(i);
        }
    }
    
    void AssignGrade(int i)
    {
        percentage[i]=(float)(marks[i]*100)/total;
        
        if(percentage[i]<=40)
        {
            Grade[i]='D';
        }
        else if(percentage[i]>40 && percentage[i]<=60)
        {
            Grade[i]='C';
        }
        else if(percentage[i]>60 && percentage[i]<=80)
        {
            Grade[i]='B';
        }
        else
        {
            Grade[i]='A';
        }
    }

    void output(int n, int total, String s)                                                       
    {
        System.out.println("\n********************************************************************\n\nThe Result of "+n+" students in a "+s+" test of "+total+" marks is :");
        for(i=0;i<n;i++)
        {
            System.out.println("\nThe details of Student "+(i+1)+" are :");
            System.out.println("Roll No - "+rno[i]+"\nName - "+Name[i]+"\nMarks - "+marks[i]+"\nPercentage - "+percentage[i]+"\nGrade - "+Grade[i]);
        }
    }
}

public class Grade {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,t;
        String sub;

        System.out.println("\nClass Result with Percentage and Grades");
        System.out.print("\nEnter the name of the subject - ");
        sub=in.next();
        System.out.print("Enter the total marks of the test - ");
        t=in.nextInt();

        System.out.print("Enter the number of students in class - ");
        n=in.nextInt();

        Student stu=new Student(n,t);
        stu.input();
        stu.output(n,t,sub);
        in.close();
    }
}
