public class HaystickNeedle{
    public static void main(String[] args) {
        String s="hello";
        String n="ll";
        System.out.println(strStr(s,n));
    }
    static int strStr(String haystack, String needle) {

        if (!haystack.contains(needle)) {
            return -1;
        } else {
            return haystack.indexOf(needle);//it will give the first occurence of the index
        }

    }
}
