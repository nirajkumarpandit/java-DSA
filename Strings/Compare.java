package Strings;

public class Compare {
    public static void main(String[] args) {
        String s1= "Niraj"; // s1 and s2 are equal they do not create new keyword
        String s2= "Niraj"; // s3 are not equal because s3 is created new keyword 
        String s3= new String("Niraj");  // new string created;
        if(s1==s2){
            System.out.println("String are equal");
        }else{
            System.out.println("String are note equal"); // output : string are equal
        }
        if(s1==s3){
            System.out.println("String are equal");
        }else{
            System.out.println("String are note equal"); // output : string are not equal
        }
        
        // equal show karne ke liye .equal() method ka use karna hoga
        if(s1.equals(s3)){
            System.out.println("string are equal");  // output: string are equal
        }else{
            System.out.println("String are not equal");
        }
    }
}
