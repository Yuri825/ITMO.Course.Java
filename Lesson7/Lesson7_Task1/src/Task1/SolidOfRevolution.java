package Task1;

class SolidOfRevolution implements Shape
{
  private double volume;
  private double radius;

  public SolidOfRevolution (double volume, double radius)
  {
      this.volume = volume;
      this.radius = radius;
  }

public double getRadius()
{
    return radius;
}

    @Override
    public double getVolume() {
        return volume;
    }
}

