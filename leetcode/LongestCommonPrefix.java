public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(ans(strs));

    }
    private static String ans(String[] strs) {
            int min_index=0;
            int min_len=1000;
            for(int i=0;i<strs.length;i++){
                if(strs[i].length()<min_len){
                    min_len=strs[i].length();
                    min_index=i;
                }

            }
            StringBuilder str = new StringBuilder();
            for(int i=0;i<strs[min_index].length();i++){
                for (String s : strs) {
                    if (strs[min_index].charAt(i) != s.charAt(i)) {
                        return str.toString();
                    }
                }
                str.append(strs[min_index].charAt(i));
            }
            return str.toString();
        }

    }

