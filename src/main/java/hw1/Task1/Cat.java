package hw1.Task1;

public class Cat {
    private String name;
    private int age;
    private String owner;

    Owner ownerCat = new Owner();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setOwnerName (String owner) {
        return ownerCat.setName(owner);
    }

    public String getOwnerName () {
        return ownerCat.getName();
    }

    public String greet() {
        return ("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года (лет)"+ ". Мой владелец " + getOwnerName() + "!");
    }
}
