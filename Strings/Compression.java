package Strings;

public class Compression {
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");  // empty String builder created
        for(int i=0; i<str.length(); i++){
            Integer count=1;    // count are use to count the character how many times are occured 
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1) ){  
                count++;
                i++;
            }
             sb.append(str.charAt(i));  // append the character in the str variable
             if(count>1){    // check if char occured less the 1 the count are not append into the string 
                sb.append(count);
             }
        }
        return sb.toString(); // finally return the output in string form
    }

    public static void main(String[] args) {
        String str = "aaaabbbbbbccde";
        System.out.println(compress(str));
    }
}
