package hw_2.task_2;

public class Item {
    public String name;
    public int iD;
    private boolean inStock;

    public int order;

    public Item(String name, int iD, boolean inStock){
        this.name = name;
        this.iD = iD;
        this.inStock = inStock;
        int order;
    }

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }
}
