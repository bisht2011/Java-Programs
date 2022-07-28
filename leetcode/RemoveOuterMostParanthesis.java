import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String str ="(()())(())";
        System.out.println(removeOuterParentheses(str));
    }

        static String removeOuterParentheses(String s) {
            Stack<Character> st = new Stack<>();
            StringBuilder ans = new StringBuilder();

            for (int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);

                if(ch == '(') {
                    if(st.size() > 0) {
                        ans.append(ch);
                    }
                    st.push(ch);
                } else {
                    st.pop();
                    if(st.size() > 0) {
                        ans.append(ch);
                    }
                }
            }
            return ans.toString();
        }

}
