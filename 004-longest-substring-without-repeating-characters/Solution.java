class Solution {
  public int lengthOfLongestSubstring(String s) {
      if(s.length() == 0) {
          return 0;
      }
      
      int result = 1;
      
      HashMap<Character, Integer> lastSeen = new HashMap();
      lastSeen.put(s.charAt(0), 0);
      
      int head = 0;
      int tail = 1;
      while(tail < s.length()) {
          char nextChar = s.charAt(tail);
          
          if(lastSeen.containsKey(nextChar) && lastSeen.get(nextChar) >= head) {
              result = Math.max(result, tail - head);
              head = lastSeen.get(nextChar) + 1;
          }
          
          lastSeen.put(nextChar, tail);
          ++tail;
      }
      
      return Math.max(result, tail - head);
  }
}
