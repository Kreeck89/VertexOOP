package homeTaskFromLists.pack6.service;

import homeTaskFromLists.pack6.models.Figura;
import homeTaskFromLists.pack6.models.Rectangle;
import homeTaskFromLists.pack6.models.Square;
import homeTaskFromLists.pack6.models.Triangle;

/**
 * Tasks from lists, page 43 (Task 1);
 *
 * Triangle extends Figura;
 * Rectangle extends Square.
 */
public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10.0, 12, 5, 7);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getSquare());

        Figura figura = new Figura(100, 5, 10);
        System.out.println(figura.getPerimetr());
        System.out.println(figura.getSquare());

        Square square = new Square(25, 10.5);
        System.out.println(square.getPerimetr());
        System.out.println(square.getSquare());

        Rectangle rectangle = new Rectangle(20.5, 15.5);
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSquare());
    }
}
