package exceptions.sem3.ex03;

//Задача: Работа со списком задач
//
// Представьте, что у вас есть приложение для управления списком задач. Вам нужно реализовать классы,
//которые позволят добавлять, удалять и выполнять задачи. Также нужно предусмотреть обработку исключений в случае ошибок.
//Для этой задачи вы можете рассмотреть следующие концепции исключений:
// Создание собственных исключений: Создайте собственное исключение TaskNotFoundException,
//которое будет выбрасываться, если задача с определенным идентификатором не найдена.
//Обработка исключений на низком уровне: В классе TaskList реализуйте методы для добавления,
//удаления и выполнения задач. При удалении задачи, выбросите исключение TaskNotFoundException,
//если задача с указанным идентификатором не существует.
//Обработка исключений на среднем уровне: Создайте класс TaskManager, который будет управлять списком задач.
//В методах этого класса обрабатывайте исключения, выбрасываемые классом TaskList,
//и предоставьте более информативные сообщения для пользователя.
//
//Обработка исключений на высоком уровне:
//В классе TaskManager создайте экземпляр TaskManager и выполните несколько операций добавления,
//удаления и выполнения задач.
//Обработайте исключения, которые могут возникнуть при выполнении этих операций,
//и выведите соответствующие сообщения.

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<TaskList> tasksLists;

    // Список списков задач

    public TaskManager() {                        // Конструктор
        tasksLists = new ArrayList<>();
    }

    public void seeAllTasks() {                     // Вывод всех списков задач на экран
        for (TaskList tasksList : tasksLists) {
            tasksList.runAll();
        }
    }

    public void runTask(String task) {      // Выполнение задачи
        try {
            for (TaskList tasksList : tasksLists) {
                tasksList.getTask(task).run(task);
            }
        } catch (TaskNotFoundException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addTask(String task) {                    // Реализация метода добавления задачи
        Task newTask = new Task(task);
        TaskList taskList = new TaskList();
        taskList.addTask(newTask);
        tasksLists.add(taskList);
    }

    public void removeTask(String task) {                  // Реализация метода удаления задачи
        try {
            for (TaskList tasksList : tasksLists) {
                if (tasksList.getTask(task).getName().equals(task)) {
                    tasksList.getTask(task).setName(null);
                }
            }
        } catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}