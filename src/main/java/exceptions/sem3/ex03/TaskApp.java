package exceptions.sem3.ex03;

public class TaskApp {
    public static void main(String[] args) throws TaskNotFoundException {
        TaskManager manager = new TaskManager();
        manager.addTask("Мыть полы");
        manager.addTask("Мыть машину");
        manager.addTask("Чесать кота");
        manager.addTask("Играть с собакой");
        manager.removeTask("Мыть полы");
        manager.seeAllTasks();
        manager.runTask("Свистеть");
    }
}