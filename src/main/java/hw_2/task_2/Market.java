package hw_2.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements IMarket{
    String name;

    int order;
    private int users;

    private void users() {
        this.users = 0;
    }

    private Queue<String> queue = new LinkedList<>();
    List<Integer> orders = new ArrayList<Integer>();


    public Market(String name){
        this.name = name;
        int order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public void QueueBehaviourIn(String User, int order) {
        queue.add(User);
        users += 1;
        orders.add(order);
        System.out.println("There is your order, " + User + ": " + order );
        update();
    }

    @Override
    public void QueueBehaviourOut(String User, int order) {
        queue.remove(User);
        users-=1;
        orders.remove(order);

        update();
    }

    @Override
    public void MarketBehaviourIn(String User) {
        System.out.println("Welcome to our online service, " + getName() + " ," + User );

        users +=1;
        update();
    }

    @Override
    public void MarketBehaviourOut(String User) {
        System.out.println("Have a good day!" + User);
        users -=1;
        update();

    }

    @Override
    public void update() {
        System.out.println("There are " + users + " users online now");
        System.out.println(orders.size() + " orders placed");

    }
}
