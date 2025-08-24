abstract class Animal{
    abstract void sound();
     void eat(){
        System.out.println("Animal is eating...");
     }
}
class Dog extends Animal {
    // @Override
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }


    void sound(String type) {
        System.out.println("Dog makes sound like: " + type);
    }
}


class Cat extends Animal {
    // @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Dog class
        Dog dog = new Dog();
        dog.sound();           
        dog.sound("Growl");      
        dog.eat();               

        // Using Cat class
        Cat cat = new Cat();
        cat.sound();          
        cat.eat();              
    }
}


