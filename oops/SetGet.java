package oops;

public class SetGet {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Niraj Kumar Pandit");
        System.out.println(st.getName());
        st.setRoll(2344);
        System.out.println(st.getRoll());
    }
}

class Student {
    private String name;
    private int roll;

    public int getRoll() {
        return this.roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int rollNo) {
        this.roll = rollNo;
    }
}
