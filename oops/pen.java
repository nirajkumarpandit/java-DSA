package oops;

public class pen {
    public static void main(String[] args) {
        pens p=new pens();
        p.setColor("yellow");
        System.out.println(p.getColor());
    }
}
class pens{
   private String color;

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }
}