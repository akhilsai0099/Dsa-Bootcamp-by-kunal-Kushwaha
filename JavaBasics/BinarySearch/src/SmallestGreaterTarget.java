public class SmallestGreaterTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target  ='a';
        System.out.println(nextGreatestLetter(arr,target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        if (target >letters[letters.length -1]){
            return letters[0];
        }

        while(start<= end){
            int mid = start +(end - start )/2;
            if (letters[mid] > target){
                end = mid-1;

            }
            else{
                start = mid+1;

            }

        }
        return letters[start%letters.length];
    }
}
