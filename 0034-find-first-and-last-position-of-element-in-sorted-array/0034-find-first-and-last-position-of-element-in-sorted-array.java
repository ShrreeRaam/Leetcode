class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = -1;
        int end = -1;
        int[]ans = new int[2];
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
            st = i;
            break;
            }
        }
         for(int i = nums.length-1;i>=0;i--)
        {
            if(nums[i] == target)
            {
            end = i;
            break;
            }
          }
          ans[0] = st;
          ans[1] = end;
          return ans;
}
}
