import java.util.*;
public class SumOFdigits {
    public static void main(String[] args) {
        System.out.println("enter the number");
        int num= new Scanner(System.in).nextInt();
        System.out.println(ans(num));
    }

    static int ans(int num) {
        if(num==0)
            return 0;

          return   (num%10) + ans(num/10);

    }
}
