import java.util.ArrayList;

public class BaseballGame {
   static public void main(String[] args){
        String[] ops = {"5","2","C","D","+"};
       System.out.println(ans(ops));
    }

    static private  int ans(String[] ops) {
        ArrayList<Integer>al = new ArrayList<>();
        for(String i:ops){
             if(i.equals("+")){
                int val=al.get(al.size()-2)+al.get(al.size()-1);
                al.add(val);
            }
            else if(i.equals("C")){
                al.remove(al.size()-1);
            }
             else if(i.equals("D")){
                int val=al.get(al.size()-1)*2;
                al.add(val);
            }

            else{
                al.add(Integer.valueOf(i));
            }
        }
        int sum=0;
        for(int i:al){
            sum+=i;
        }
        return sum;
    }
}
