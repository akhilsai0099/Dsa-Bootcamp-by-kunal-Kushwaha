public class ReverseWord {
    public static void main(String[] args) {
        String word = "Akhil sai";
        System.out.println(reverseWords(word));
    }
    static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                reverse(arr,start, i-1);
                start = i+1;
            }
        }
        reverse(arr,start, arr.length-1);
        return new String(arr);

    }
    static void reverse(char[] arr, int start, int end){
        while (start < end) {
            char t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}
