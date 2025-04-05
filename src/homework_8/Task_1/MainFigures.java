package homework_8.Task_1;

import java.awt.*;

public class MainFigures {

    public static void main(String[] args) {

        Figures triangle = new Triangle(1, 3, 180);
        Figures rectangle = new Rectangle(5, 2);
        Figures circle = new Circle(5);
        Figures rectangle1 = new Rectangle(8, 4);
        Figures circle1 = new Circle(9.7);

        Figures[] getArray = new Figures[]{triangle, rectangle, circle, rectangle1, circle1};


        double perimeter = 0;

        for (Figures figure : getArray) {
            perimeter += figure.getPerimeter();
        }

        System.out.println("Сумма периметра всех фигур в массиве: " + perimeter);
    }
}
