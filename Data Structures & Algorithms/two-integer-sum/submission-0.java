class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int index =0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i : nums) {
            if(hmap.containsKey(target - i)){
               ans[0]= hmap.get(target-i);
               ans[1]= index;
            }
            else{
                hmap.put(i,index);
                index++;
            }
        }
        return ans;
    }
}
