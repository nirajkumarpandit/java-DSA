package oops;

public class inheritance {
    public static void main(String[] args) {
        shark s1=new shark();
        s1.eat();
    }
}
class fish{
    String color;
     void eat(){
        System.out.println("eat");
     }
}
class shark extends fish{
    void run(){
        System.out.println("ryun");
    }
}
