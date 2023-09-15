package exceptions.sem3.ex03;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {           // Добавить задачу в список задач
        tasks.add(task);
    }


    public void removeTask(Task task) throws TaskNotFoundException {        // Реализация метода удаления задачи из списка задач
        for (Task task1 : tasks) {
            if (task1.getName().equals(task.getName())) {
                tasks.remove(task1);
                System.out.println("Задача успешно удалена");
            } else throw new TaskNotFoundException("Задача не найдена");
        }
    }

    public void run(String name) throws TaskNotFoundException {             // Реализация метода выполнения задачи
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                task.run(name);
            } else throw new TaskNotFoundException("Задача не найдена!");
        }
    }

    public void runAll() {                                                  // Реализация метода выполнения всех задач
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }

    public Task getTask(String name) throws TaskNotFoundException, NullPointerException {          // Геттер для задачи
        for (Task task : tasks) {
            if (name == null) {
                throw new NullPointerException("Task " + name + " not found");
            }
            if (task.getName().equals(name)) {
                return task;
            } else throw new TaskNotFoundException("Task " + name + " not found");

        }
        return null;
    }

}