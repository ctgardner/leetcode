class Solution {
  public int myAtoi(String str) {
      if(str.length() == 0) {
          return fail();
      }
      
      char[] cStr = str.toCharArray();
      int index = 0;
      
      while(index < cStr.length && cStr[index] == ' ') {
          ++index;
      }
      
      if(index == cStr.length) {
          return fail();
      }
      
      int sign = 1;
      if(cStr[index] == '-') {
          sign = -1;
          ++index;
      }
      else if(cStr[index] == '+') {
          ++index;
      }
      
      if(index == cStr.length || cStr[index] < '0' || cStr[index] > '9') {
          return fail();
      }
      
      int result = 0;
      while(index < cStr.length && cStr[index] >= '0' && cStr[index] <= '9') {            
          int nextDecimal = Character.getNumericValue(cStr[index]);
          
          if((Integer.MAX_VALUE - nextDecimal) / 10 < result) {
              if(sign == -1) {
                  return Integer.MIN_VALUE;
              }
              
              return Integer.MAX_VALUE;
          }
          
          result = result * 10 + nextDecimal;
          ++index;
      }
      
      return result * sign;
  }
  
  private int fail() {
      return 0;
  }
}
