class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split(" ");
        String res="";
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i]!="")
            {
                if(i!=0)
                {
                    res=res+str[i]+" ";
                }
                else
                {
                    res=res+str[i];
                }
            }
        }
        return res;
    }
}