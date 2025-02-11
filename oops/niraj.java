package oops;

public class niraj {
    public static void main(String[] args) {
        boy St=new boy();
        St.name="Niraj";
        System.out.println(St.name);
        St.roll=323;
        boy b1=new boy(St);
        System.out.println(b1.name);
    }
}
class boy{
     String name;
     int roll;
    boy(){
        
    }
     // copy constructor
     boy (boy St){
        this.name=St.name;
     }
    }