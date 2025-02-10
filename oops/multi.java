package oops;

public class multi {
    public static void main(String[] args){
        son s1=new son();
        s1.dada();
        s1.papa();
    }
}
class Gparent{
    void dada(){
        System.out.println("I am your dada");
    }
}
class father extends Gparent{
    void papa(){
        System.out.println("I am your papa");
    }
}
class son extends father {
    void beta(){
        System.out.println("you are my beta");
    }
}
