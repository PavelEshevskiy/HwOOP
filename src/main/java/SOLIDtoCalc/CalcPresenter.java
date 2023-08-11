package SOLIDtoCalc;

/**
 * Зависит от абстракции ICalcModel, а не от конкретной реализации.
 * Это позволяет легко заменить класс CalcModel на другую реализацию ICalcModel, не изменяя код класса;
 *
 */
public class CalcPresenter {
    private CalcView view;
    private CalcModel model;

    public CalcPresenter(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;
    }

    public void calculate() {
        double firstNumber = view.getFirstNumber();
        double secondNumber = view.getSecondNumber();
        String operation = view.getOperation();
        double result = 0;

        switch (operation) {
            case "+":
                result = model.add(firstNumber, secondNumber);
                break;
            case "-":
                result = model.subtract(firstNumber, secondNumber);
                break;
            case "*":
                result = model.multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = model.divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }

        view.showResult(result);
    }
}
