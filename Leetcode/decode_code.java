package Leetcode;

import java.util.HashMap;

public class decode_code {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String decoded = sol.decodeMessage(key, message);
        System.out.println("Decoded message: " + decoded);
    }
}

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        int temp = 97; // ASCII value of 'a'

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !hm.containsKey(ch)) {
                hm.put(ch, (char) temp);
                temp++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch != ' ') {
                char val = hm.get(ch);
                ans.append(val);
            } else {
                ans.append(' ');
            }
        }

        return ans.toString();
    }
}