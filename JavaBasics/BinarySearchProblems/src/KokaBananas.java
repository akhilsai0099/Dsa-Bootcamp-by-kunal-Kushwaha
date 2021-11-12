import java.util.Arrays;

public class KokaBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int ans = 0;
        int start =0;
        int end =  piles.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if (isPossible(piles, piles.length, h, mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;

        }


    static boolean isPossible(int[] arr ,int n, int h , int mid ){
        int hours = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%mid == 0){
                hours += arr[i]/mid;
            }
            else{
                hours += (arr[i]/mid)+1;
            }
        }

        if (hours > h){
            return false;
        }
        return true;
    }
}
