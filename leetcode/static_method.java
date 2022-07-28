import java.util.Stack;

public class static_method {
    static int n=10;
    public static void main(String[] args) {
        static_method k  = new static_method();
        System.out.println(n);
        System.out.println(k.ok());
        System.out.println(n);


    }
    public int ok(){
       return n=20;
    }
}
