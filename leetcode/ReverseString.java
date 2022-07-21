import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine();
        System.out.println(reverse(str));
        rev1(str);
        String s = "i like this program very much ";
        char []p = reverseWords(s.toCharArray());
        System.out.print(p);
    }

        // Reverse the letters
         // of the word
        static void reverse(char str[],
                            int start,
                            int end)
        {
// Temporary variable
// to store character
            char temp;

            while (start <= end)
            {
                // Swapping the first
                // and last character
                temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        // Function to reverse words
        static char[] reverseWords(char []s)
        {
// Reversing individual words as
// explained in the first step

            int start = 0;
            for (int end = 0; end < s.length; end++)
            {
                // If we see a space, we
                // reverse the previous
                // word (word between
                // the indexes start and end-1
                // i.e., s[start..end-1]
                if (s[end] == ' ')
                {
                    reverse(s, start, end);
                    start = end + 1;
                }
            }

// Reverse the last word
            reverse(s, start, s.length - 1);

// Reverse the entire String
            reverse(s, 0, s.length - 1);
            return s;
        }

    static void rev1(String str) {
        String[] stra =str.split(" ");//split the string and save in array
        System.out.println(Arrays.toString(stra));
        for(int i=0;i< (stra.length+1)/2;i++){
            String temp=stra[i];
            stra[i]=stra[stra.length-i-1];
            stra[stra.length-i-1]=temp;
        }
        System.out.println(String.join(" ",stra));
    }

    //aayush bisht
//    bisht aayush
//    hsuyaa
     static String reverse(String str) {
        char[] ch= str.toCharArray();
       for(int i=0;i<(ch.length+1)/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1]=temp;

        }
return  new String(ch);
    }
}
