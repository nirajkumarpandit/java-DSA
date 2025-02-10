package oops;

public class Constructor {
    public static void main(String[] args) {
        Student St=new Student("Niraj kumar pandit");
        System.out.println(St.name);
    }
}
class Student{
   public String name;
    Student(String name){
        this.name=name;
    }
}