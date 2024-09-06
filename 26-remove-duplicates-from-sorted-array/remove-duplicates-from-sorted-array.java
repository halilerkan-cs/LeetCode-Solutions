class Solution {
    public int removeDuplicates(int[] nums) {
        int k = findDuplicates(nums);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[0] - 1) {
                for(int j = i; j < nums.length; j++) {
                    if(nums[j] != nums[0] - 1){
                        nums[i] = nums[j];
                        nums[j] = nums[0] - 1;
                        break;
                    }
                }
            }
        }

        return k;
    }

    public int findDuplicates(int[] nums) {
        int k = nums.length;
        for(int i = 1; i < nums.length; i++)
            if(nums[i] == nums[i-1]){
                int j = i;
                for(; j < nums.length; j++) {
                    if(nums[j] != nums[i - 1]){
                        break;
                    }
                    nums[j] = nums[0] - 1;
                    k--;
                }
                i = j;
            }

        return k;
    }
}