package function;

public class binaryTodecimal {
    public static void binTodecimal(int bin){
        int pow=0;
        int decimal=0;
        int binary=bin;
        while(bin>0){
            int lastdig=bin%10;
            decimal =decimal +(int) (lastdig * Math.pow(2, pow));
            pow++;
            bin /=10;
        }
        System.out.println("decimal of "+binary+" = "+ decimal);

    }
    public static void main(String[] args) {
        binTodecimal(101);
    }
}
