import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number of which you want the fibonacci series");
        int n=scan.nextInt();
        System.out.println(fibona(n));
    }

    static int fibona(int n) {
        if(n<2)
            return n;
        else
            return fibona(n-1)+fibona(n-2);
    }
}
