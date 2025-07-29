class Solution {
    public int singleNumber(int[] nums) {
        int k = 0;
        for(int num : nums)
        {
            k^=num;
        }
        return k;
    }
}