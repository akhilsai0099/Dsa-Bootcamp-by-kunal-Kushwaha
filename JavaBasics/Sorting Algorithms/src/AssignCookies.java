public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7,10,9,8,7};
        int[] s = {10,9,8,7};

        System.out.println(findContentChildren(g,s));
    }

    static int findContentChildren(int[] g, int[] s) {
        sort(g);
        sort(s);
        int ans = 0;
        int i = g.length -1;
        int j =s.length - 1;

        while (i >= 0 && j >= 0) {
            if (g[i] <= s[j]){
                ans++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        
        
        return ans;
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            while (j > 0 && j < nums.length) {
               if (nums[j] < nums[j-1]){
                   swap(nums, j , j-1);
                   j--;
               }
               else{
                   break;
               }
            }
        }
    }
    static void swap(int[] nums, int pos1, int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

}
