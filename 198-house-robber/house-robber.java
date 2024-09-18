class Solution {
    public int rob(int[] nums) {
        int[] totalStealed = new int[nums.length];
        totalStealed[0] = nums[0];
        if(nums.length > 1)
            totalStealed[1] = Math.max(totalStealed[0], nums[1]);
        else
            return totalStealed[0];
        if(nums.length > 2)
            totalStealed[2] = Math.max(totalStealed[0] + nums[2], totalStealed[1]);

        for(int i = 3; i < nums.length; i++) {
            totalStealed[i] = Math.max(
                        Math.max(totalStealed[i-2] + nums[i], totalStealed[i-3] + nums[i]),
                                totalStealed[i-1]);
        }

        return Math.max(totalStealed[nums.length - 1], totalStealed[nums.length - 2]);
    }
}