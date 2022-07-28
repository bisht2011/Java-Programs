import java.util.*;
public class LengthOfLastWord {
    public static void main(String[] args) {
String s="hello fir se keso ho";
        System.out.println(lengthOfLastWord(s));
//        int n=5;
//        int c=0;
//        String[] str = s.trim().split(" ");
//        c=str[str.length-5].length();              any index
//        System.out.println("size of any string"+c);
    }

   static int lengthOfLastWord(String s) {
        int count = 0;
       String str=s.trim();
       for(int i =str.length()-1;i>=0;i--){
           if(str.charAt(i)==' '){
               break;
           }
           else
               count++;
       }
       return count;
           }
}
