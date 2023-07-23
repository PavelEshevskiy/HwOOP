package hw_2.task_1;

public class Rectangle extends Shapes {
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

    @Override
    public Double calculateArea() {
        return (double) (width * height);
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (2 *(width * height));
    }
}
