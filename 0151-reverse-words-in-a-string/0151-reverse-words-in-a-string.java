class Solution {
    public String reverseWords(String s) {
        String res = "";
        String word = "";
        boolean space = true;
        for(int i = s.length()-1;i>=0;i--)
        {
         char ch = s.charAt(i);   
          
          if(ch != ' ')
          {
          word = ch + word;
          space = false;
          }
          else
          {
            if(!space)
            {
            res += word+" ";
            word = "";
            space = true;
            }
          }
        }
        if(word!="")
        {
            res+=word;
        }
        int len = res.length();
        if (len > 0 && res.charAt(len - 1) == ' ') 
        {
            String temp = "";
            for (int i = 0; i < len - 1; i++)
           {
                temp += res.charAt(i);
            }
            res = temp;
        }
        return res;
    }
}