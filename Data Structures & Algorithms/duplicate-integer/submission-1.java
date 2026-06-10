class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int count =1;
        for(int i=0; i<nums.length;i++) {
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],count+1);
                return true;
            }
            else{
                hmap.put(nums[i],1);
            }
        }
      return false;
    }
}