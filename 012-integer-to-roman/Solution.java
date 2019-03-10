class Solution {
  public String intToRoman(int num) {
      String roman = "";
      
      int thousands = num / 1000;
      if(thousands > 0) {
          roman += generate('M', thousands);
          num = num % 1000;
      }
      
      int hundreds = num / 100;
      if(hundreds == 9) {
          roman += "CM";
      }
      else if(hundreds == 4) {
          roman += "CD";
      }
      else if(hundreds > 4) {
          roman += "D" + generate('C', hundreds - 5);
      }
      else if(hundreds > 0) {
          roman += generate('C', hundreds);
      }
      num = num % 100;
      
      int tens = num / 10;
      if(tens == 9) {
          roman += "XC";
      }
      else if(tens == 4) {
          roman += "XL";
      }
      else if(tens > 4) {
          roman += "L" + generate('X', tens - 5);
      }
      else if(tens > 0) {
          roman += generate('X', tens);
      }
      num = num % 10;
      
      int ones = num;
      if(ones == 9) {
          roman += "IX";
      }
      else if(ones == 4) {
          roman += "IV";
      }
      else if(ones > 4) {
          roman += "V" + generate('I', ones - 5);
      }
      else if(ones > 0) {
          roman += generate('I', ones);
      }
      
      return roman;
  }
  
  private static String generate(char c, int i) {
      String result = "";
      
      while(i > 0) {
          result += c;
          --i;
      }
      
      return result;
  }
}
