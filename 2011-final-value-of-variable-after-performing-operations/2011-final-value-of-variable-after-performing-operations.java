class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String s1 = "++X";
        String s2 = "X++";
        String s3 = "--X";
        String s4 = "X--";
        int cnt = 0;
        for(int i = 0;i<operations.length;i++)
        {
            if(operations[i].equals(s1) || operations[i].equals(s2))
            {
                cnt++;
            }
            else if(operations[i].equals(s3) || operations[i].equals(s4))
            {
                cnt--;
            }
            else
            {
                continue;
            }
        }
        return cnt;
    }
}