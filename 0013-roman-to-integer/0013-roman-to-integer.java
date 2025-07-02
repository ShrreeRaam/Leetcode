class Solution {
    public int romanToInt(String s) {
        int prev = 0;
        int sum = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            int val = 0;

            if(ch == 'I') val =  1;
            else if(ch == 'V') val =  5;
            else if(ch == 'X') val =  10;
            else if(ch == 'L') val =  50;
            else if(ch == 'C') val =  100;
            else if(ch == 'D') val =  500;
            else if(ch == 'M') val =  1000;
            if(val<prev)
            sum-=val;
            else
            sum+=val;

            prev = val;
        }
        return sum;
    }
}