public class RotationString {
    public static void main(String[] args) {
        String s = "hello";
        int d = 3;
        int count = 0;
        String ans = s.substring(d) + s.substring(0, d);
        System.out.println(ans);

    }
}