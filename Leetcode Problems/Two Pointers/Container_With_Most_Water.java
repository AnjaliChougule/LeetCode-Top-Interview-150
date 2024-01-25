class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        int curr_Area = 0;
        while(l!=r){
            curr_Area = Math.min(height[l],height[r]) * (r-l);
            maxArea = Math.max(curr_Area,maxArea);
            if (height[l] < height[r]){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        int target = 7;
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}