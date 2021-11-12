public class MiniminElementInArray {
    public static void main(String[] args) {
        int []arr = {4,5,6,7,9,2};
        System.out.println(Findmin(arr));
    }

    static int Findmin(int[] arr){
        int num = Integer.MAX_VALUE;
        for (int integer : arr){
            if (integer < num){
                num = integer;
            }
        }
        return num;
    }
}
