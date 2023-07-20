package hw1.Task1;

public class CatsOwners {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Лаки");
        cat1.setAge(10);
        cat1.setOwnerName("Павел");
        System.out.println(cat1.greet());
    }
}
