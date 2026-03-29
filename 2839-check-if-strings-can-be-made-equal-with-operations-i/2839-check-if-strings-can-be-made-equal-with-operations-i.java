class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        char[] arr1 = s1.toCharArray();
        char temp = arr1[0];
        arr1[0] = arr1[2];
        arr1[2] = temp;
        if (new String(arr1).equals(s2)) return true;
        char[] arr2 = s1.toCharArray();
        temp = arr2[1];
        arr2[1] = arr2[3];
        arr2[3] = temp;
        if (new String(arr2).equals(s2)) return true;
        char[] arr3 = s1.toCharArray();
        temp = arr3[0];
        arr3[0] = arr3[2];
        arr3[2] = temp;
        temp = arr3[1];
        arr3[1] = arr3[3];
        arr3[3] = temp;
        if (new String(arr3).equals(s2)) return true;
        return false;
    }
}