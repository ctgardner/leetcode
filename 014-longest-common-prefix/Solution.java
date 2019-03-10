class Solution {
  public String longestCommonPrefix(String[] strs) {
      if(strs == null || strs.length == 0) {
          return "";
      }
      
      int shortestLength = strs[0].length();
      for(int i = 1; i < strs.length; ++i) {
          shortestLength = Math.min(shortestLength, strs[i].length());
      }
      
      String commonPrefix = "";
      for(int i = 0; i < shortestLength; ++i) {
          char c = strs[0].charAt(i);
          
          for(int j = 1; j < strs.length; ++j) {
              if(strs[j].charAt(i) != c) {
                  return commonPrefix;
              }
          }
          
          commonPrefix += c;
      }
      
      return commonPrefix;
  }
}
