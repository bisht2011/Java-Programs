import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        String str= "aaaccccdd";
    System.out.println(longestPalindrome(str));
        System.out.println(longestPalindrome1(str));
        System.out.println(ans(str));


    }
        static int longestPalindrome(String s) {
            int[] char_count=new int[128];
            for(char c:s.toCharArray()){
                char_count[c]++;
            }
            int sum=0;
            for(Integer Char_count:char_count){
                sum+=Char_count/2*2;
                if(sum%2==0&&Char_count%2==1){
                    sum+=1;
                }
            }
            return sum;
        }
    static int longestPalindrome1(String s) {
    int count = 0;
    HashSet<Character> data = new HashSet<Character>();
        for (int i = 0; i < s.length(); i ++) {
        char c = s.charAt(i);
        if (data.contains(c)) {
            count += 2;
            data.remove(c);//accccdd
        }
        else {
            data.add(c);
        }
    }
        if (data.size() > 0) {
        count ++;
    }
        return count;
}
static int ans(String s){
        int sum=0;
        HashMap<Character,Integer>map=new HashMap<>();
        //first we will add all the occurrence of the each character in the map
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        //if the first occurrence of any character is odd add it and if any character that comes after it having odd
    //  occurrence minus it by 1 to add it in the rest
    // to make it a palindrome
        boolean odd = true;
        for(Character ch:map.keySet()){
            if(map.get(ch)%2==0){
                sum+=map.get(ch);
            }
            else{
                if(odd){
                    sum+=map.get(ch);
                    odd=false;
                }
                else{
                    sum+=map.get(ch)-1;

                }

            }
        }
        return sum;
}
    }

