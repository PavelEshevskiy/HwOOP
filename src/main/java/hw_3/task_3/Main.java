package hw_3.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список объектов, которые нужно отсортировать
        List<SomeObject> objects = new ArrayList<>();
        objects.add(new SomeObject("Object 1", 5));
        objects.add(new SomeObject("Object 2", 3));
        objects.add(new SomeObject("Object 3", 7));

        // Создаем компаратор для сортировки объектов по значению
        Comparator<SomeObject> comparator = (o1, o2) -> Integer.compare(o1.getValue(), o2.getValue());

        // Вызываем функцию sortList, передавая список объектов и компаратор
        List<SomeObject> sortedList = sortList(objects, comparator);

        // Выводим отсортированный список на экран
        for (SomeObject object : sortedList) {
            System.out.println(object.getName() + " - " + object.getValue());
        }
    }

    public static List<SomeObject> sortList(List<SomeObject> objects, Comparator<SomeObject> comparator) {
        // Используем метод Collections.sort() для сортировки списка объектов с помощью переданного компаратора
        Collections.sort(objects, comparator);

        return objects;
    }
}
