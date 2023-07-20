package hw1.Task2;

public class Calculator {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина первого прямоугольника равна: " + rectangle1.getWidth());
        System.out.println("Высота первого прямоугольника равна: " + rectangle1.getHeight());
        System.out.println("=".repeat(100));
        Rectangle rectangle2 = new Rectangle(4,10);
        rectangle1.calculateArea();
        rectangle2.calculateArea();
        System.out.println("=".repeat(100));
        rectangle1.calculatePerimeter();
        rectangle2.calculatePerimeter();
    }
}
