abstract class Shape 
{
    abstract void NumberOfSides();
}

class Trapezoid extends Shape
{
    public void NumberOfSides()
    {
        System.out.println("Trapezoids have 4 sides.");
    }
}

class Triangle extends Shape
{
    public void NumberOfSides()
    {
        System.out.println("Triangles have 3 sides.");
    }
}

class Rectangle extends Shape
{
    public void NumberOfSides()
    {
        System.out.println("Rectangles have 4 sides.");
    }
}

class Hexagon extends Shape
{
    public void NumberOfSides()
    {
        System.out.println("Hexagons have 6 sides.");
    }
}

public class MainShape 
{
    public static void main(String args[])
    {
        System.out.println("Abstract Class\n");

        Trapezoid ob1 = new Trapezoid();
        Triangle ob2 = new Triangle();
        Rectangle ob3 = new Rectangle();
        Hexagon ob4 = new Hexagon();

        ob1.NumberOfSides();
        ob2.NumberOfSides();
        ob3.NumberOfSides();
        ob4.NumberOfSides();
    }    
}
