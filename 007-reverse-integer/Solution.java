class Solution {
  public int reverse(int i) {
      boolean negative = false;
      if(i < 0) {
          negative = true;
          i *= -1;
      }

      int reversed = 0;
      while(i != 0) {
          int nextDigit = i % 10;
          
          if((Integer.MAX_VALUE - nextDigit) / 10 < reversed) {
              reversed = 0;
              break;
          }
          
          reversed *= 10;
          reversed += i % 10;
          
          i /= 10;
      }

      if(negative) {
          reversed *= -1;
      }

      return reversed;
  }
}
