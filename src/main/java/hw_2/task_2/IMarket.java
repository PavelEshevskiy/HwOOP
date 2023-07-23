package hw_2.task_2;

public interface IMarket {
    void QueueBehaviourIn(String User, int order);//имитируют работу очереди
    void QueueBehaviourOut(String User, int order);
    void MarketBehaviourIn(String User);//добавляют и удаляют людей из очереди

    void MarketBehaviourOut(String User);
    void update();//обновляет состояние магазина путем принятия и отдачи заказов
}
