package exceptions.sem3.ex02;

class Cat extends Animal {
    private boolean isHungry;

    Cat(boolean isHungry) {
        this.isHungry = isHungry;
    }

    @Override
    void makeSound() throws HungryCatException {
        if (isHungry) {
            throw new HungryCatException("Кошка голодна и не может издать звук");
        }
        System.out.println("Мяу-мяу");
    }
}