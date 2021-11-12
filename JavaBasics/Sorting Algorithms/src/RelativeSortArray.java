public class RelativeSortArray {
    public static void main(String[] args) {

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] freq1 = new int[1001];
        boolean[] freq2 = new boolean[1001];

        for (int i = 0; i < n; i++) {
            freq1[arr1[i]]++;
        }

        for (int i = 0; i < n; i++) {
            freq2[arr1[i]] = true;
        }

        int[] ans = new int[n];

        int idx = 0;

        for (int i = 0; i < m; i++) {
            int target = arr2[i];
            int current = freq1[target];
            while(current > 0 && freq2[target]){
                ans[idx++] = target;
                current--;
            }
        }

        idx = n-1;

        for (int i = 1000; i >= 0; i--) {
            int target = i;
            int current = freq1[i];
            while(current > 0 && !freq2[target]){
                ans[idx--] = target;
                current--;
            }
        }
        return ans;
    }
}
