class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {     
        if(right <= left){
            if(target > nums[left])
                return left + 1;
            return left;
        }

        int mid = (right + left) / 2;
        if(nums[mid] == target)
            return mid;

        if(target > nums[mid])
            return binarySearch(nums, target, mid + 1, right);
        return binarySearch(nums, target, left, mid - 1);
    }
}