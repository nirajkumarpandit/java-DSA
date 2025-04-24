package Strings;

public class ShortestPath {
    public static float Spath(String path){
        int X=0; int Y=0;
        for(int i=0; i<path.length(); i++){
            char dir= path.charAt(i); // give direction
            // south
            if(dir=='S'){
                Y--;
            }
            else if(dir=='W'){ // west
                X--;
            }
            else if(dir=='E'){ //East
                X++;
            }
            else{    // North
                Y++;
            }
        }
        int x2=X*X; // displacement formula using
        int y2= Y*Y;
        return (float)Math.sqrt(x2 + y2); // type cast into float 
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(Spath(path));
    }
}
