import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(arr));
    }
    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] row: image){
            for(int i=0;i<(image[0].length+1)/2;i++)
            {//xor with 1 also give the opposite number
                int temp = row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return  image;
    }
}
