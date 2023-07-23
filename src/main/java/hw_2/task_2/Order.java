package hw_2.task_2;

public class Order {
    public int number;
    public String item;
    public int iD;


    public Order(int number) {
        this.number = number;
        String item;
        int iD;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setItem(String item, int iD) {
        this.item = item;
        this.iD = iD;
    }
}
