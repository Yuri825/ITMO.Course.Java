// Изменить иерархию spahes (использовать абстрактные классы, где это возможно) 

package Task1;

public class Main {

    public static void main(String[] args) {
        // Экземпляр класса BOX
        Box newBox = new Box(5000);

        Ball ball = new Ball(5);

        Cylinder cylinder = new Cylinder(8, 9);

        Pyramid pyramid = new Pyramid(7, 8);

        System.out.println("Объём шара равен: ");
        System.out.println(newBox.add(ball));


        System.out.println("Объём цилиндра равен: ");
        System.out.println(newBox.add(cylinder));


        System.out.println("Объём пирамиды равен: ");
        System.out.println(newBox.add(pyramid));
    }
}
