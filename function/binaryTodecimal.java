package function;

public class binaryTodecimal {
    // binary to decimal conversion

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
    // decimal to binary 
    public static void decimalTObinary(int n){
        int mynumber =n;
        int pow=0;
        int binary=0;
        while (n>0) {
            int reminder=n%2;
            binary =binary+(reminder* (int)Math.pow(10, pow));
            pow++;
            n /=2;
        }
        System.out.println("binary of "+ mynumber +" ="+ binary);

    }
    public static void main(String[] args) {
        decimalTObinary(7);
    }
}
