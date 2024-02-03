
// LeetCode
// Probelm Link : https://leetcode.com/problems/container-with-most-water/

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;

        while (left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area=h*w;
            maxArea=Math.max(area,maxArea);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
