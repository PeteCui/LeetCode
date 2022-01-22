import java.util.HashMap;
/*
HashMap<Integer, Integer> hashtable = new HashMap<>();
hashtable.containsKey(key);
hashtbale.get(key);
*/
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int k = target - nums[i];
            if(hashtable.containsKey(k)){
                return new int[] {hashtable.get(k), i};
            }
            hashtable.put(nums[i],i);
        }
        
        return new int[]{};
        
    }
}