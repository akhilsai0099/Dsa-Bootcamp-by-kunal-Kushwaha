public class MountainArrayFindTarget {
    public static void main(String[] args) {
    }

    //https://leetcode.com/problems/find-in-mountain-array/

//    static int search(MountainArray arr, int target){
//        int peak = peakIndexInMountainArray(arr);
//        int firstTry = orderagnosticSearch(arr,target,0,peak);
//
//        if (firstTry != -1){
//            return firstTry;
//        }
//        int secondTry = orderagnosticSearch(arr,target,peak+1,arr.length()-1);
//        return secondTry;
//    }
//
//    static int orderagnosticSearch(MountainArray arr, int key,int start, int end){
//        while(start<= end){
//            int mid = start +(end - start )/2;
//            if (arr.get(mid) == key){
//                // answer found;
//                return mid;
//            }
//            if (arr.get(0)< arr.get(arr.length() -1)){
//                if (arr.get(mid) > key){
//                    end = mid-1;
//                }
//                else{
//                    start = mid+1;
//                }
//            }
//            else{
//                if (arr.get(mid) < key){
//                    end = mid-1;
//                }
//                else{
//                    start = mid+1;
//                }
//            }
//
//
//        }
//        return -1;
//
//    }
//
//    static int peakIndexInMountainArray(MountainArray arr) {
//        int start = 0, end = arr.length()-1;
//        while(start< end){
//            int mid = start +(end - start )/2;
//            if (arr.get(mid) > arr.get(mid+1) ){
//                end = mid;
//            }
//            else{
//                start = mid+1;
//            }
//
//        }
//        return start;
//
//    }
}
