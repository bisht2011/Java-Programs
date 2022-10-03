import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
       String s = "a#c#";
       String t = "ac##";
        System.out.println(ans(s,t));
    }

    private static boolean ans(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String S) {
        Stack<Character> ans = new Stack<>();
        for (char c: S.toCharArray()) {
            if (c == '#') {
                if (!ans.empty())
                    ans.pop();
            }
            else
                ans.push(c);
        }
        return String.valueOf(ans);
    }
    }


