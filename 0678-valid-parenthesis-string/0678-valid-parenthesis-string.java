class Solution {
    public boolean checkValidString(String s) {
        boolean flag = false;
        int count = 0;
        int count2 = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '*')
            count++;
            else
            count--;
            if(count<0)
            return false;
        }
        for(int i = s.length()-1;i>=0;i--)
        {
             char ch = s.charAt(i);
            if(ch == ')' || ch == '*')
            count2++;
            else
            count2--;

            if(count2<0)
            return false;
        }
        return true;
    }
}