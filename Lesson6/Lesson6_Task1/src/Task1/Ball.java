package Task1;

public class Ball extends SolidOfRevolution
{

    // Объем шара: V = 4/3 * П * r3

    public Ball (double radius)
    {
        super((Math.PI * radius*radius*radius)*4/3, radius);

    }


}
