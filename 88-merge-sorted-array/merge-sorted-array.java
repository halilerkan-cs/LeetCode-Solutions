class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index1 = m-1, index2 = n-1, indexResult = m+n-1;

        for(; index1 >= 0 && index2 >= 0; indexResult--){
            if(nums1[index1] >= nums2[index2]){
                nums1[indexResult] = nums1[index1];
                index1--;
            }else{
                nums1[indexResult] = nums2[index2];
                index2--;
            }
        }


        if(index1 >= 0) {
            for(; index1 >= 0; index1--, indexResult--){
                nums1[indexResult] = nums1[index1];
            }
        }else if(index2 >= 0) {
            for(; index2 >= 0; index2--, indexResult--){
                nums1[indexResult] = nums2[index2];
            }
        }

    }
}