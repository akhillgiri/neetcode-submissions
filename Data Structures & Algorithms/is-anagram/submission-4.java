class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarray = s.toCharArray(); 
        char[] tarray = t.toCharArray(); 
        Arrays.sort(sarray);             
        Arrays.sort(tarray);
        boolean ans = false;
        if(Arrays.equals(sarray, tarray))
        {
            ans = true;
        }          
       return ans;
    }
}
