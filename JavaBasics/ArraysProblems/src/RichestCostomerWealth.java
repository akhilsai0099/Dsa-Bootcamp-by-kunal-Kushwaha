public class RichestCostomerWealth {
    public static void main(String[] args) {
        int[][] arr = { {1,5},
                        {7,3},
                        {3,5}};

        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int ans =  Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                ans = Integer.max(ans, sum);
            }
        }

        return ans;
    }

}

