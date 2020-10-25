package Task1;

public class Pyramid implements Shape
{
    private double height;
    private double s;

    // Объем пирамиды: (1 / 3) * S * h
    // S - площадь основания пирамиды
    // h - высота пирамиды
    Pyramid(double height, double s) {

        this.height = height;
        this.s = s;

    }

    @Override
    public double getVolume() {
        return height * s * 1/3;
    }
}
