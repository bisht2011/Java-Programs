import java.util.HashMap;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        String s ="abcabb";
        System.out.println(ans(s));
        System.out.println(ans2(s));
        System.out.println(ans3(s));
    }

 static char ans3(String s) {
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return '-';
    }

    private static char ans2(String s) {//optimal O(n)time complexity
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '-';
    }

    private static char ans(String s) {
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&(i!=j)){//check a with each character
                    flag=true;
                    break;
                }
            }
            if(!flag)
                return s.charAt(i);
        }
        return '-';
    }
}
