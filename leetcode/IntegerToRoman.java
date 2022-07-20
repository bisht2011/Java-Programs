public class IntegerToRoman {
    public static void main(String[] args) {
        int num=56;
        System.out.println(intToRoman(num));
    }
        static String intToRoman(int num) {
            StringBuilder s = new StringBuilder();
            int[] intege={1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] roma={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
            for(int i=0;i<intege.length;i++){
                while(num>=intege[i]){
                    s.append(roma[i]);
                    num-=intege[i];
                }
            }
            return s.toString();
    }
}
