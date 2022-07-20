public class LongestPalindrome {
    public static void main(String[] args) {
        String str= "abccccdd";
    System.out.println(longestPalindrome(str));


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
    }

