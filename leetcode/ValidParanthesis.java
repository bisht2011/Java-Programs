public class ValidParanthesis {
    public static void main(String[] args) {
        String s="({{{}}})()";
        System.out.println(isValid(s));
    }
        static boolean isValid(String s) {
            int length;
            do {
                length = s.length();
                s = s.replace("()", "").replace("{}", "").replace("[]", "");
            } while (length != s.length());
            return s.length() == 0;
        }
    }

