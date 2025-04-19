class Solution {
    public int climbStairs(int n) {
        if(n<=3)
        return n;
        int prev = 3;
        int now = 5;
        int sum = 0;
        for(int i = 4;i<n;i++)
        {
            sum = prev+now;
            prev = now;
            now = sum;
        }
        return now;
    }
}