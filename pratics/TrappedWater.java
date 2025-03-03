package pratics;

public class TrappedWater {
    public static int RainWater(int height[]){
        // calculate left max boundry
        int maxLeft[]=new int[height.length];
        maxLeft[0]=height[0];
        for(int i=1; i<height.length; i++){
            maxLeft[i]=Math.max(maxLeft[i-1], height[i]);
        }
       
        // claculate right max boundry
        int rightMax[]=new int[height.length];
          rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i]=Math.max(rightMax[i+1], height[i]);
        }
        // calculate water level and trapped water
        int TrappedWater=0;
        for(int i=0; i< height.length; i++){
            int waterLevel=Math.min(maxLeft[i], rightMax[i]);
            TrappedWater += (waterLevel-height[i]);
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(RainWater(height));
    }
}
