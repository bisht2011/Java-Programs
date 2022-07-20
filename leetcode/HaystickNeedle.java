public class HaystickNeedle{
    public static void main(String[] args) {
        String s="hello";
        String n="ll";
        System.out.println(strStr(s,n));
    }
    static int strStr(String haystack, String needle) {
        int ans = 0;
        if(!haystack.contains(needle)){
            return -1;
        }
        else {
            ans = ans + haystack.indexOf(needle);
        }

        return ans;
    }
}
