class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            int temp = target - nums[i];
            
            if(map.containsKey(temp)){
                ans[0]=map.get(temp);
                ans[1]=i;
                break;
            }
            
            map.put(nums[i],i);
        }
        
        return ans;
    }
}
