package exceptions.sem3.ex03;

import java.util.Objects;

public class Task {

    String name;     // Имя задачи

    public Task(String name) {         //Передаём имя
        this.name = name;
    }

    public void setName(String name) {        //Сеттер
        this.name = name;
    }

    public String getName() {               //Геттер
        return name;
    }

    public void run(String name) throws TaskNotFoundException {         //
        if (!Objects.equals(name, this.name)) {
            throw new TaskNotFoundException("Задача не найдена!");
        }
        System.out.println("Задача " + name + " выполняется");
    }
}