import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hashMap = new HashMap <Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++){
            int wanted = target - nums[i];
            if (hashMap.get(wanted) != null){
                return new int[] {i, hashMap.get(wanted)};
            }else{
                hashMap.put(nums[i], i);
            }
        }
        
        return null;
    }
}