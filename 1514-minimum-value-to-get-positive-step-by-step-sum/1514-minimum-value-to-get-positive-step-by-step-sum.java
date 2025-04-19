class Solution {
    public int minStartValue(int[] nums)
     {
        int arr[] =new int[nums.length];
        int sum=0;
        int min=0;
        for(int i=0;i<nums.length;i++)
        {
         sum+=nums[i];
         min = Math.min(sum,min);  
        }
        return 1-min;
        
    }
}