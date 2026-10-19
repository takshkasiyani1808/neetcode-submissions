class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int number : nums) {
            if (hs.contains(number))
                return true;
            else 
                hs.add(number);
        }
        
        return false;
    }
}