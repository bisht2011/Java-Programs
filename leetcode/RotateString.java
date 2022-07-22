public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="eabcd";
        System.out.println(rotateString(s,goal));

    }

        static boolean rotateString(String s, String goal) {
            int flag = 0;
            for(int i=0;i<s.length();i++)
            {
                String leftrotate = s.substring(i)+s.substring(0,i);
                if(leftrotate.equals(goal))
                    flag = 1;
            }
            if(flag==1)
                return true;
            else
                return false;
        }
}
