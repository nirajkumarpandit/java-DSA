package oops;

public class Sum {
    public static void main(String[] args) {
        Cat m=new Cat();
    }
}
class Girl{
    Girl(){
        System.out.println("girl constructor called");
    }
}
class Cat extends Girl{
    Cat(){                     
        super();      // called first parent class after child class
        System.out.println("cat constructor called");
    }
}