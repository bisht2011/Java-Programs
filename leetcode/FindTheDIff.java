import java.util.*;

public class FindTheDIff {
    public static void main(String[] args) {
        String s="abcdeg";
        String t="abcdefg";
        System.out.println(finddiff(s,t));
    }

    private static  char finddiff(String s, String t) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!hs.contains(t.charAt(i)))
                return t.charAt(i);
        }

//        int[] freq=new int[26];
//        for(int i=0;i<t.length();i++){
//            freq[t.charAt(i)-'a']++;
//        }
//        for(int i=0;i<s.length();i++){
//            freq[s.charAt(i)-'a']--;
//        }
//       for(int i=0;i<freq.length;i++){
//           if(freq[i]>=1){
//               return (char) ('a'+i);
//           }
//       }
        return 'n';
    }
}


