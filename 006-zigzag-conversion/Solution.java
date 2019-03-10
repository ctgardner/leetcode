class Solution {
  public String convert(String s, int numRows) {
      if(numRows < 1) {
          return "";
      }
      
      if(numRows == 1) {
          return s;
      }
      
      String[] lines = new String[numRows];
      for(int i = 0; i < numRows; ++i) {
          lines[i] = "";
      }
      
      lines[0] += s.charAt(0);
      
      int index = 0;
      
      int line = 1;
      int dir = 1;
      for(int i = 1; i < s.length(); ++i) {
          lines[line] += s.charAt(i);
          
          if(line == 0 || line == numRows - 1) {
              dir *= -1;
          }
          
          line += dir;
      }
      
      String result = "";
      for(int i = 0; i < lines.length; ++i) {
          result += lines[i];
      }
      
      return result;
  }
}
