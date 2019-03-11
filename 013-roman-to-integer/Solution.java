class Solution {
    private static HashMap<Character, Integer> legend;
    
    public Solution() {
        legend = new HashMap<>();
        
        legend.put('I', 1);
        legend.put('V', 5);
        legend.put('X', 10);
        legend.put('L', 50);
        legend.put('C', 100);
        legend.put('D', 500);
        legend.put('M', 1000);
    }
        
    public int romanToInt(String s) {
        int total = 0;
        
        int i = 0;
        while(i < s.length() - 1) {
            int numeralValue = legend.get(s.charAt(i));
            int nextNumeralValue = legend.get(s.charAt(i + 1));
        
            if(numeralValue < nextNumeralValue) {
                total += nextNumeralValue - numeralValue;
                i += 2;
            }
            else {
                total += numeralValue;
                ++i;
            }
        }
        
        if(i == s.length() - 1) {
            total += legend.get(s.charAt(s.length() - 1));
        }
        
        return total;
    }
}
