public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {17,2,62,8,3,36};
        System.out.println(linearSearch(arr,1));
    }

    static boolean linearSearch(int[] arr,int key) {
        for (int num : arr) {
            if (num == key){
                return true;
            }
        }
        return false;
    }


}
