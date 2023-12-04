
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow (Cat's sound)");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
