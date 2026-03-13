class Solution {
    public int maximum69Number (int num) {
        int count=0;
        int temp=num;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        int[] arr=new int[count];
        for(int i=count-1;i>=0;--i)
        {
            arr[i]=temp%10;
            temp=temp/10;
        }
        for(int i=0;i<count;i++)
        {
            if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }
        int res=0;
        for(int k:arr)
        {
            res=res*10+k;
        }
        return res;
    }
}