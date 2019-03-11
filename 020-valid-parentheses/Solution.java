class Solution {
  public boolean isValid(String s) {
      HashMap<Character, Character> closingParens = new HashMap<>();
      closingParens.put(')', '(');
      closingParens.put('}', '{');
      closingParens.put(']', '[');
      
      Stack<Character> stack = new Stack<>();
      for(int i = 0; i < s.length(); ++i) {
          char nextChar = s.charAt(i);
          
          if(closingParens.containsKey(nextChar)) {
              if(stack.empty() || stack.peek() != closingParens.get(nextChar)) {
                  return false;
              }
              
              stack.pop();
          }
          else {
              stack.push(nextChar);
          }
      }
      
      return stack.empty();
  }
}
