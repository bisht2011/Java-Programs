public class RansomNote {
    public static void main(String[] args) {
        String s="aa";
        String s1="aabc";
        System.out.println(ans(s,s1));
    }

    private static boolean ans(String ransomNote, String magazine) {
    int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
        freq[magazine.charAt(i)-'a']++;
    }
         for (int i = 0; i < ransomNote.length(); i++) {
        if(--freq[ransomNote.charAt(i)-'a'] < 0) {
            return false;
        }
    }
        return true;
}
}
