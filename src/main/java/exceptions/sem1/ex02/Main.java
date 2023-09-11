package exceptions.sem1.ex02;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] num2 = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num1.length; i++) {
                try {
                    System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Деление на 0 недопустимо");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Выход за границы массива");
        }
    }
}

//java.lang.Throwable
//java.lang.Error
//java.lang.Exception

//    Throwable (базовый класс для исключений)
//      Error (системные ошибки, обычно не предполагается обработка)
//      Exception (ошибки в прикладном коде)
//          Checked exceptions (компилятор требует обработку)
//          Unchecked exceptions (не требуют обработки)
