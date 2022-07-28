import java.util.*;

public class LetterCombinationPhone {
    public static void main(String[] args) {
        String s="23";
        System.out.println(ansi(s));

    }

     static List<String> ansi(String s) {

         ArrayList<String>result=new ArrayList<>();
         if(s.isEmpty()){
             return result;
         }
         HashMap<Integer,String>map=new HashMap<>();
         map.put(2,"abc");
         map.put(3,"def");
         map.put(4,"ghi");
         map.put(5,"jkl");
         map.put(6,"mno");
         map.put(7,"pqrs");
         map.put(8,"tuv");
         map.put(9,"wxyz");

         helper("",s,map,result);
         return result;
     }

    private static void helper(String s, String s1, HashMap<Integer, String> map, ArrayList<String> result) {
        if(s1.isEmpty()){
            result.add(s);
            return;
        }
        int digit=s1.charAt(0)-'0';//convert character value of given string into integer value
        for(int i=0;i<map.get(digit).length();i++){
            helper(s+map.get(digit).charAt(i),s1.substring(1),map,result);
        }
    }
}
