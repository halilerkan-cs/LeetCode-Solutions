class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
                count++;
            }
            else if(nums[i] != majority)
                count--;
            else
                count++;
        }

        return majority;
    }
}