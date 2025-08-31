package Stack;
import java.util.*;
public class StockSpan {
    public static void stockSpan(int stocks[],int span[]){
        // create a stack to store index of previous high
        Stack <Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice=stocks[i];
            while(! s.isEmpty() && currPrice >stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek(); // index of prev high
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span); // call function
        for(int i=0; i<span.length; i++){ 
            System.out.println(span[i]+" ");
        }
    }
}
