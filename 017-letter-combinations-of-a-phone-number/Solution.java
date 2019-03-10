class Solution {
  private static char[][] legend = new char[][] {
      new char[] { 'a', 'b', 'c' },
      new char[] { 'd', 'e', 'f' },
      new char[] { 'g', 'h', 'i' },
      new char[] { 'j', 'k', 'l' },
      new char[] { 'm', 'n', 'o' },
      new char[] { 'p', 'q', 'r', 's' },
      new char[] { 't', 'u', 'v' },
      new char[] { 'w', 'x', 'y', 'z' }
  };
  
  public List<String> letterCombinations(String digits) {
      List<String> result = new ArrayList<String>();
      
      for(int i = 0; i < digits.length(); ++i) {
          int digit = Character.getNumericValue(digits.charAt(i));
          result = Solution.addNumber(result, Solution.legend[digit - 2]);
      }
      
      return result;
  }
  
  private static List<String> addNumber(List<String> words, char[] chars) {
      List result = new ArrayList<String>();
      
      if(words.size() == 0) {
          for(int i = 0; i < chars.length; ++i) {
              result.add("" + chars[i]);
          }
      }
      else {
          for(String word : words) {
              for(int i = 0; i < chars.length; ++i) {
                  result.add(word + chars[i]);
              }
          }
      }
      
      return result;
  }
}
