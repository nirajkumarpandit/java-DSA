package oops;

public class Multilevel {
    public static void main(String[] args){
        Man m=new Man();
        m.eat();
        m.noteat();
    }
}
 interface Veg{  // it is a blueprint of class 
    void eat();
}
interface Non_veg{ // same here
    void noteat();
}
class Man implements Veg ,Non_veg{  // access another class 
   public void eat(){
        System.out.println("eat both");
    }
   public void noteat(){
        System.out.println("grass");
    }
}
