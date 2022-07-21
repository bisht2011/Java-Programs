import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LXIV";
        System.out.println(romanToInt(s));
    }
           static  int romanToInt(String s) {
                HashMap<Character,Integer>hm=new HashMap<>();
                hm.put('I',1);
                hm.put('V',5);
                hm.put('X',10);
                hm.put('L',50);
                hm.put('C',100);
                hm.put('D',500);
                hm.put('M',1000);
                int ans=hm.get(s.charAt(s.length()-1));//place the last digit
                for(int i=s.length()-2;i>=0;i--){
                    if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))//compare the last and second last digit if last
                        //digit is greater than second subtract it otherwise add it
                        ans-=hm.get(s.charAt(i));
                    else
                        ans+=hm.get(s.charAt(i));

                }
                return ans;
            }

        }
