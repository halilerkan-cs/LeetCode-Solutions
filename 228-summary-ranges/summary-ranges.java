class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int front = 0, back = 0;

        while(front < nums.length) {
            if(front + 1 != nums.length && nums[front] + 1 == nums[front + 1]){
                front++;
            }else{
                if(back == front){
                    ranges.add(nums[back] + "");
                }else{
                    ranges.add(nums[back] + "->" + nums[front]);
                }
                front++;
                back = front;
            }
        }

        return ranges;
    }
}