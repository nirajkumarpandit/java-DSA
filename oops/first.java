package oops;

public class first {
    public static void main(String[] args) {
        System.out.println("niraj");
        student s1=new student();
        s1.name ="Niraj kumar";
        System.out.println( s1.branch="b.tech cse");
        s1.roll=233;
        s1.changename("manish kumar pandit");
        System.out.println(s1.name);
    }
}

class student{
    String name;
    int roll;
    String branch;
    void changename(String newName){
        name=newName;
    }
}