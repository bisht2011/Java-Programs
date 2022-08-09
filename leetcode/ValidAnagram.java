public class ValidAnagram {
    public static void main(String[] args) {
        String s="aabc";
        String s1="caba";
        System.out.println(ans(s,s1));
    }

    private static boolean ans(String s, String t) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i:freq){
            if(i!=0)
                return false;
        }
        return true;
    }
    }

