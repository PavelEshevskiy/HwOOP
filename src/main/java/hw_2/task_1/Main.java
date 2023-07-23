package hw_2.task_1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина первого прямоугольника равна: " + rectangle1.getWidth());
        System.out.println("Высота первого прямоугольника равна: " + rectangle1.getHeight());
        System.out.println("=".repeat(100));
        Rectangle rectangle2 = new Rectangle(4,10);
        System.out.println("Площадь первого прямоугольника = " + rectangle1.calculateArea());
        System.out.println("Площадь второго прямоугольника = " + rectangle2.calculateArea());
        System.out.println("=".repeat(100));
        System.out.println("Периметр первого прямоугольника = " + rectangle1.calculatePerimeter());
        System.out.println("Периметр второго прямоугольника = " + rectangle2.calculatePerimeter());

    }
}
