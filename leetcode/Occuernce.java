import java.util.*;

public class Occuernce {
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String");
        String str=scan.next();
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<>();
        for(char character:ch){
            if (!hash.containsKey(character)) {
                hash.put(character,1);
            }
            else
                hash.put(character,hash.get(character)+1);
        }
        for (Map.Entry entry : hash.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
        System.out.println(hash.toString());
    }
    }

