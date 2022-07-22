import java.util.*;
 class SkipingChar {
    public static void main(String[] args) {
        System.out.println("enter the string");
        String str=new Scanner(System.in).nextLine();
        System.out.println(ans(str));
    }

      static String ans(String str) {
        StringBuilder ST = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a')
                continue;
            else
                ST.append(str.charAt(i));

        }
        return ST.toString();
     }
 }
