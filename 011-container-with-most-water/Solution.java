class Solution {
  public int maxArea(int[] height) {
      int maxVolume = 0;
      
      int left = 0;
      int right = height.length - 1;
      
      while(left < right) {
          int volume = Solution.getVolume(left, height[left], right, height[right]);
          maxVolume = Math.max(maxVolume, volume);
          
          if(height[left] < height[right]) {
              ++left;
          }
          else {
              --right;
          }
      }
      
      return maxVolume;
  }
  
  private static int getVolume(int x1, int y1, int x2, int y2) {
      int length = x2 - x1;
      int height = Math.min(y1, y2);
      
      return length * height;
  }
}
