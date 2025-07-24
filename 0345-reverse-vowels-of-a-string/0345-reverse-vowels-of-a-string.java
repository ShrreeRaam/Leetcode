class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        String v = "AEIOUaeiou";
        int st = 0;
        int end = s.length()-1;
        while(st<end)
        {
            if(!(v.contains(String.valueOf(ch[st])))){
                st++;
            }
            if(!(v.contains(String.valueOf(ch[end])))){
                end--;
            }
            if(v.contains(String.valueOf(ch[st])) && ((v.contains(String.valueOf(ch[end])))))
            {
                char temp = ch[st];
                ch[st] = ch[end];
                ch[end] = temp;
                st++;
                end--;
            }
        }
        String str="";
        for(int i=0 ;i<ch.length;i++)
        {
            str+=ch[i];
        }
        return str;
    }
}