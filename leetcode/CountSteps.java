import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
int c=0;
        System.out.println("enter the number");
        int num = new Scanner(System.in).nextInt();
        System.out.println("numbers of steps: " + count(num,c));
    }

    static int count(int num,int c) {
        if(num==0)
            return c;

        if(num%2==0){
            return (count(num/2,c+1));
        }
        else {
            return (count(num - 1, c + 1));
        }
    }
}