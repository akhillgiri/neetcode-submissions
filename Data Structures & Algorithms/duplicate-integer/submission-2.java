class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i : nums){
            if(hmap.containsKey(i)){
                return true;
            }
            else{
               hmap.put(i, hmap.getOrDefault(0, i) + 1);
            }
        }
        return false;
    }
}