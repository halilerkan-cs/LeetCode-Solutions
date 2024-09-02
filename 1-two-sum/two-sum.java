class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            List indexes = map.get(nums[i]);
            if(indexes == null){
                indexes = new ArrayList<Integer>();
            }
            indexes.add(i);
            map.put(nums[i], indexes);
        }

        for(int i = 0; i < nums.length; i++) {
            List<Integer> indexes1 = map.get(nums[i]);
            int difference = target - nums[i];
            List<Integer> indexes2 = map.get(difference);
            
            if(indexes1 != null && indexes2 != null){
                if(nums[i] == difference){
                    if(indexes1.size() > 1)
                        return new int[]{indexes1.get(0).intValue(), indexes1.get(1).intValue()};
                }else{
                    return new int[]{indexes1.get(0).intValue(), indexes2.get(0).intValue()};           
                }
            }
        }

        return new int[]{};
    }
}