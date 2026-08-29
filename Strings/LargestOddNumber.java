package Strings;

public class LargestOddNumber {
    public static void main(String[] args) {
        String num="1234568";
        for(int i=num.length()-1; i>=0; i--){
            int digit =num.charAt(i)-'0';// convert character into number
            if(digit %2 !=0){
                System.out.println(num.substring(0,i+1));
                break;
            }
        }
    }
}
