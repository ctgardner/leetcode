class Solution {
  private int minIndex = 0;
  private int maxIndex = 0;
  
  public String longestPalindrome(String s) {
      if(s.length() == 0 || s.length() == 1) {
          return s;
      }
      
      int minIndex = 0;
      int maxIndex = 0;
      
      for(int i = 1; i < s.length(); ++i) {
          foobar(s, i, i);
          foobar(s, i - 1, i);
      }
      
      return s.substring(this.minIndex, this.maxIndex + 1);
  }
  
  private void foobar(String s, int start, int end) {
      int len = checkPalindrome(s, start, end) - 1;
      
      int minIndex = start - len;
      int maxIndex = end + len;
      
      if(maxIndex - minIndex > this.maxIndex - this.minIndex) {
          this.minIndex = minIndex;
          this.maxIndex = maxIndex;
      }
  }
  
  private int checkPalindrome(String s, int start, int end) {
      if(start < 0 || end >= s.length() || s.charAt(start) != s.charAt(end)) {
          return 0;
      }
      
      return 1 + checkPalindrome(s, start - 1, end + 1);
  }
}
