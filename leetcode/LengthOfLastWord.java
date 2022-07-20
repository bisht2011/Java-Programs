public class LengthOfLastWord {
    public static void main(String[] args) {
String s="hello fir se";
        System.out.println(lengthOfLastWord(s));
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
