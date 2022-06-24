import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number of which you want the factorial");
        int n=scan.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if(n==1)
            return n;
        else
            return n*fact(n-1);
    }
}
