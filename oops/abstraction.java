package oops;

public class Abstraction {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.walk();  // abstract class ka object create nahi ho sakta hai
    }
}
abstract class Animal {
    void eat(){
        System.out.println("eat animal");
    }
    abstract void walk();   // only idea deta hai abstract class
}
class Dog extends Animal{
    void walk(){
        System.out.println("dog 4 lags");
    }
}
class man extends Animal{
    void walk(){
        System.out.println("man 2 lags");  // yaha  per implement huaa hai
    }
}