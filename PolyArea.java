import java.util.Scanner;
public class PolyArea{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int side;
        double area,length;

        System.out.print("Enter the number of sides of the polygon - ");
        side=in.nextInt();
        System.out.print("Enter the length of sides of the polygon - ");
        length=in.nextDouble();
        in.close();

        area=polyArea(side,length);
        
        System.out.print("The area of the hexagon is - "+area);
    }

    public static double polyArea(double s,double l)
    {
        return (s*(l*l))/(4*Math.tan((Math.PI/s)));
    }
}

