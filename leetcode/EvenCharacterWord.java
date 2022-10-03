public class EvenCharacterWord {
    public static void main(String[] args) {
        String s ="aabcbewdfad";
        System.out.println(removeodd(s));
    }

    private static int removeodd(String s) {
       return (s.length()&1)==0 ? 0:1;
    }
}
