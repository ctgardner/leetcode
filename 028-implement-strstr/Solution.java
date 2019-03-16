class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }

        int needleStart = -1;
        for(int i = 0; i <= haystack.length() - needle.length(); ++i) {
            boolean found = true;

            for(int j = 0; j < needle.length(); ++j) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if(found) {
                needleStart = i;
                break;
            }
        }

        return needleStart;
    }
}