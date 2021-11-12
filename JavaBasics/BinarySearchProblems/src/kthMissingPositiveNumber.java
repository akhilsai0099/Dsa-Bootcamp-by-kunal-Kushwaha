public class kthMissingPositiveNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(hell(arr, k));

    }

    static int hell(int [] arr, int k){

        int i=0;
        int j= arr.length-1;
        int currK=0;

        while(i+1  < j){

            int m = (j-i)/2 +i;
            int numberToBe = m+1;
            int missingCount = arr[m]- numberToBe;
            /**If Number found at mid is at correct index or number of element missing to left is more than K
             e.g    { 1,3,4,21,22  } K =2 So Number missing at mid  which is 4 is number of missing elements  4 - (2+1) = 1
             so more missing at right
             */
            if(missingCount==0 || missingCount < k ){
                i=m;
            }else{
                j=m;
            }

        }

        int diffLeft =  arr[i] -  (i+1);
        int diffRight = arr[j] -   (j+1);

        if(i==0 && k <= diffLeft ){
            return k;
        }

        if(k>= diffLeft && k <= diffRight){
            return arr[i] + (k-diffLeft);
        }

        return arr[j] + (k-diffRight);
    }
}
