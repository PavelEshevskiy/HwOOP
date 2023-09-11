package exceptions.sem1.ex01;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            nums[7] = 10;
            System.out.println("Это строка не выведется");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }
}
