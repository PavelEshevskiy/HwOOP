package SOLIDtoCalc;

/**
 * В Main создается экземпляр конкретной реализации класса CalcModel, но он передается в CalcPresenter
 * через абстракцию ICalcModel. Это позволяет легко изменять или заменять реализацию ICalcModel
 * без изменения кода класса CalcPresenter
 */
public class Main {
    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcPresenter presenter = new CalcPresenter(view, model);

        presenter.calculate();
    }
}
