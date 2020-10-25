package Task1;

import java.util.ArrayList;

public class Box implements Shape
{
    private double valBox; // сичтать доступное место
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private double available;

    public Box(double available)
    {
        this.available = available;
    }

    public boolean add (Shape shape)
    {

        if (available >= shape.getVolume())
        {
            shapes.add(shape);
            available -= shape.getVolume();
            System.out.println(shape.getVolume());
            System.out.println("Общий объём коробки: " + Math.round(valBox));

            return true;
        }
        else
        {
            System.out.println("Коробочка полна");
            return false;
        }

    }

    @Override
    public double getVolume() {
        return available;
    }
}
