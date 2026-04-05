class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[4];
        for(char c : moves.toCharArray())
        {
            if(c == 'U')
            {
                arr[0]++;
            }
            else if(c == 'D')
            {
                arr[1]++;
            }
            else if(c == 'L')
            {
                arr[2]++;
            }
            else
            {
                arr[3]++;
            }
        }
        if(arr[0] == arr[1] && arr[2] == arr[3])    return true;
        return false;
    }
}