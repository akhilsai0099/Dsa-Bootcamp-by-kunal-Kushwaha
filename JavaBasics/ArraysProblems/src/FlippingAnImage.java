import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
     int[][] image = {{1}};
     int[][] images  = flipAndInvertImage(image);
     for (int[] pixel : images){
         System.out.println(Arrays.toString(pixel));
     }
    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i <image.length; i++) {
            int n = image[i].length-1;
            for (int j = 0; j <=(n); j++) {
                int temp = image[i][j];
                image[i][j]= image[i][n];
                if (image[i][j] ==0){
                    image[i][j] =1;
                }
                else{
                    image[i][j] =0;
                }
                image[i][n] = temp;
                if (image[i][n] ==0){
                    image[i][n] =1;
                }
                else{
                    image[i][n] =0;
                }
                n--;
            }

        }
        return image;
        }

    }

