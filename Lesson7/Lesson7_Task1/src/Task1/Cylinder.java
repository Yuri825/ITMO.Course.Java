package Task1;

public class Cylinder extends SolidOfRevolution
{
   private double height;


    // Объем цилиндра: v = П*r2*h
    public Cylinder(double radius, double height)
    {
        super(Math.round(Math.PI * radius * radius * height), radius);
        this.height = height;
    }

}
