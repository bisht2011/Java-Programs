public class SquareRoot {
    public static void main(String[] args) {
int n=8;
        System.out.println(mySqrt(n));
    }
   static int mySqrt(int x) {
        if(x == 0) return 0;

        int left = 1, right = x;

        while(left <= right){
            int mid = left + (right-left)/2;

            // check if we found out the perfect square
            if(mid == x/mid){
                return mid;
            }

            // if the mid is large for our square, then reduce the right value
            else if(mid > x/mid){
                right = mid - 1;
            }

            // else increase the left value
            else{
                left = mid + 1;
            }
        }

        // if no answer found till this point, then definitely the right will be the answer
        return right;
    }
}
