package oops;

public class overfiding {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("Eat animal");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("eat dog");
    }
}
