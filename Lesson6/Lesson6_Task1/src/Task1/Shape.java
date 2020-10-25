package Task1;

abstract class Shape
{
    //    double volume = 500;

    private double volume;

    public Shape (double volume)
    {
        this.volume = volume;
    }

    public double getVolume ()
    {
        return volume;
    }
}
