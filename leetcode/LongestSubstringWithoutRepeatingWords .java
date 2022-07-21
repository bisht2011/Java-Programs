import java.util.*;
class LongestSubstringWithoutRepeatingWords {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring2(s));
    }

    static int lengthOfLongestSubstring(String s) {//optimal solution
        int max = 0, i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    static int lengthOfLongestSubstring2(String s) {
        int max = 0, start = 0, end = 0;
        StringBuilder str = new StringBuilder(Character.toString(s.charAt(start)));
        while (end < s.length() - 1) {
            if (str.indexOf(Character.toString(s.charAt(end + 1))) == -1) {
                str.append(s.charAt(end + 1));
                max = Math.max(max, str.length());
                end++;

            } else {
                str.setLength(0);
                start++;
                str.append(Character.toString(s.charAt(start)));
                end = start;
            }
        }
        return max;
    }
}