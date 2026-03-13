class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans = binarySearch(nums, target, 0, nums.length-1);
        return ans;
    }

    private boolean binarySearch(int[] arr, int key, int left, int right) {
        int mid = left + (right - left) / 2;
        if(left > right)
        {
            return false;
        }
       if(key == arr[mid])
       {
            return true;
       }
       if (arr[left] == arr[mid] && arr[mid] == arr[right])
       {
            return binarySearch(arr, key, left + 1, right - 1);
       }
       if(arr[left] <= arr[mid])
       {
            if(key >= arr[left] && key < arr[mid])
            {
                return binarySearch(arr, key, left, mid-1);
            }
            else
            {
                return binarySearch(arr, key, mid+1, right);
            }
       }
       else
       {
            if(key > arr[mid] && key <= arr[right])
            {
                return binarySearch(arr, key, mid+1, right);
            }
            else
            {
                return binarySearch(arr, key, left, mid-1);
            }
       }
    }
}