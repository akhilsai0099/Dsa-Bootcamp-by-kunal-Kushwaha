import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for(int i = 0; i<image.length; i++ ){
            for(int j = 0; j<(image[i].length+1)/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - j -1] = temp ^ 1;
            }
        }
        System.out.println(Arrays.toString(image));
    }
}
