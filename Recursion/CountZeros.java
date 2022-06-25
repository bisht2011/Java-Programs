import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {


        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
        System.out.println("numbers of zero: " + count(num));
    }

     static int count(int num) {
        return helper(num,0);
    }

     static int helper(int num, int c) {
        if(num==0)
            return c;
        int rem=num%10;
        if(rem==0){
            return(helper(num/10,c+1));
        }
        return helper(num/10,c);
    }
}
