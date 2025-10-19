package Queue;
import java.util.*;
public class First_non_repeating {
    public static void fNonRepeating(String str){
        // create freq array to store element kitni baar aya hai
        int freq[]=new int[26];
        // create Queue to track kon element pahle aaya hai
        Queue<Character> q=new LinkedList<>();
        // traverse all string 
        for(int i=0; i<str.length(); i++){
            // access one by one character
            char ch=str.charAt(i);
            // add character in queue
            q.add(ch);
            //increase freq value
            freq[ch-'a']++;
            // remove element untill first non repeting element
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str="aabccxb";
        fNonRepeating(str);
    }
}
