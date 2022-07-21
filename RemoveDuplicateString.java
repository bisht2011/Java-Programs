import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s="aayush";
        System.out.println(RD(s));
    }

    static String RD(String s) {
        StringBuilder s1 = new StringBuilder();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}
