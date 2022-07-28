import java.util.*;
public class Fizz_bizz{
        public static void main(String[] args) {
                System.out.println("enter the number");
        int n=new Scanner(System.in).nextInt();
                System.out.println(fizz(n));
        }

        private static List<String> fizz(int n) {
                ArrayList<String> list = new ArrayList<>();
                for(int i=0;i<n;i++){
                        boolean fizz_3=((i+1)%3)==0;
                        boolean fizz_5=((i+1)%5)==0;
                        if(fizz_3&&fizz_5)
                                list.add("FizzBuzz");
                        else if(fizz_3)
                                list.add("Fizz");
                        else if(fizz_5)
                                list.add("Buzz");
                        else{
                                list.add(Integer.toString(i+1));
                        }

                }
                return list;
        }

}
