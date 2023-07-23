package hw_2.task_1;

public abstract class Shapes implements IShapes {

        public final int sides = 2;

        Double height;
        Double width;

        public Shapes() {

        }

        public Shapes(Double height, Double width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public Double calculateArea() {          // Преопределение метода интерфейса
            return height * width;
        }

        @Override
        public Double calculatePerimeter() {  // Преопределение метода интерфейса

            return sides * (height + width);
        }
}
