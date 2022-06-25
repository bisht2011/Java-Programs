import java.util.Scanner;

public class Reverse {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
//        System.out.println(ansi(num));
        ansi2(num);
        System.out.println(sum);
    }

    static int ansi2(int num) {
        if(num==0){
            return num;
        }
        int rev=num%10;
        sum=sum*10+rev;
        return ansi2(num/10);
    }

    static  int ansi(int num) {
        if(num<10){
            return num;
        }
       System.out.print(num%10);
        return ansi(num/10);
    }
}
