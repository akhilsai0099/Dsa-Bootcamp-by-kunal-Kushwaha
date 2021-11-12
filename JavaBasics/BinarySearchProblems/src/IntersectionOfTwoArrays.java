
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j =0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i]< nums2[j]){
                i++;
            }  else{
                j++;
            }
        }
        int[] r = new int[result.size()];
        for(int c = 0; c<result.size(); c++){
            r[c] = result.get(c);
        }
        return r;

    }


}
