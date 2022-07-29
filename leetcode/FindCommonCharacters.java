import java.util.*;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"flow", "flower","flowing"};
        System.out.println(ans(words));

    }

    private static List<String> ans(String[] words) {
        int[]freq=count(words[0]);//we will create a frequency array for the first words in the array
        for (int i = 1; i < words.length; i++) {
            freq = intersection(freq, count(words[i]));//intersection btw the frequncy of first word and all the other
            //words
        }
            List<String>st= new ArrayList<>();
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    char a='a';
                    String s=String.valueOf(a += i);//we will then loop through the frequency array and store only
                    //the non zero character and minus its frequency each time when we find it till we get it to 0
                    while(freq[i]>0){
                        st.add(s);
                        freq[i]--;
                    }
                }
            }
            return st;
        }


    private static int[] intersection(int[] freq, int[] count) {
        int[] temp =new int[26];
        for (int i=0;i<26;i++){
            temp[i]=Math.min(freq[i],count[i]);//we will compare both their frequencies and store that array
            //having the lowest frequency
        }
        return temp;
    }

    static int[] count(String words){
    int[] temp = new int[26];
            for(int j=0;j< words.length();j++){
                temp[words.charAt(j) - 'a']++;//calculate the frequency of each character in the temp array
            }

            return temp;
        }
    }
