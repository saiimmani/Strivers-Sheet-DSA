class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case
        if(strs == null || strs.length == 0)
            return "";

        // Assume first string is common prefix
        String prefix = strs[0];

        // Compare with every other string
        for(int i = 1; i < strs.length; i++) {

            // Keep reducing prefix until current string starts with it
            while(strs[i].indexOf(prefix) != 0) {

                // Remove last character
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
