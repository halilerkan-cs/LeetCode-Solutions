class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0, swap = nums.length - 1;
        for(; i < nums.length && swap >= i; i++){
            if(nums[i] == val){
                nums[i] = nums[swap];
                swap--;
                i--;
            }
        }

        return swap + 1;
    }
}