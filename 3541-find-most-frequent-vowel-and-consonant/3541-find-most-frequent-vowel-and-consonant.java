class Solution {
    public int maxFreqSum(String s) {
       /* int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            int k = s.charAt(i) - 'a';
            arr[k]++;  
        }
        int[] res1=new int[5];//(arr[0],arr[4],arr[8],arr[14],arr[20]);
        res1[0] = arr[0];
        res1[1] = arr[4];
        res1[2] = arr[8];
        res1[3] = arr[14];
        res1[4] = arr[20];
        arr[0]=0;arr[4]=0;arr[8]=0;arr[14]=0;arr[20] = 0;
        int max1 = res1[0];
        for(int i=0;i<5;i++)
        {
            if(max1<res1[i])
            {
                max1=res1[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max2<arr[i])
            {
                max2=arr[i];
            }
        }
        return max1+max2;*/
        HashMap<Character,Integer> map = new HashMap<>();
        int max_v=0,max_c=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char key:map.keySet())
        {
            if(key=='a'||key=='e'||key=='i'||key=='o'||key=='u')
            max_v=Math.max(max_v,map.get(key));
            else
            max_c=Math.max(max_c,map.get(key));
        }
        return max_v+max_c;
    }
}