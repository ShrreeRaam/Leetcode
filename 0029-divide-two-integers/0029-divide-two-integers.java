class Solution {
    public int divide(int dividend, int divisor) {
        long divide = 1;
        divide = (long)dividend / (long)divisor;
        if(divide>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        else if(divide<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        else return (int)divide;
    }
}