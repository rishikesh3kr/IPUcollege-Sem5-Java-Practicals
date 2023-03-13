class circle
{
    public void draw()
    {
        System.out.println("The value of radius is required to draw a circle.\n");
    }
}

class rectangle extends circle
{
    public void draw()
    {
        System.out.println("The values of length and breadth are required to draw a rectangle.\n");
    }
}

class triangle extends circle
{
    public void draw()
    {
        System.out.println("The values od sides are required to draw a triangle.\n");
    }
}

public class DynamicPol {
    public static void main(String args[])
    {
        System.out.println("\nDynamic Polymorphism\n");

        circle ob1 = new circle();
        circle ob2 = new rectangle();
        circle ob3 = new triangle();
        ob1.draw();
        ob2.draw();
        ob3.draw();
    }
}
