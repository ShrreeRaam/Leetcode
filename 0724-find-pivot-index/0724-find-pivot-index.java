class Solution {
    public int pivotIndex(int[] nums) {
        int arr[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum+= nums[i];
        }
        for(int i = 1;i<nums.length;i++)
        {
            arr[i] = arr[i-1]+nums[i-1];
        }
        for(int i = 0;i<arr2.length;i++)
        {
            sum = sum-nums[i];
            arr2[i]=sum;
        }
        for(int i = 0;i<arr.length;i++)
       {
        if(arr[i]==arr2[i]) return i;
       }
       return -1;
    }
}