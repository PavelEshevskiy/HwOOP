package hw_5;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);

// Обработка действия пользователя (например, нажатие кнопки "Сложить")
        presenter.onAddButtonClicked();
    }
}
