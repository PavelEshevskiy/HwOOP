package hw1.Task2;

public class Rectangle {
    private int width;
    private int height;

    Rectangle() {
        this.width = 3;
        this.height = 9;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int setWidth(int width) {
        return this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int setHeight(int height) {
        return this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void calculateArea() {
        System.out.println("Площадь прямоугольника равна: " + width * height);
    }

    public void calculatePerimeter() {
        System.out.println("Периметр прямоугольника равен: " + (2 *(width * height)));
    }
}
