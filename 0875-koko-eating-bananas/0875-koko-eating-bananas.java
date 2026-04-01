class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }

        int low = 1, high = maxi;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    long calculateTotalHours(int[] arr, int hourly) {
        long totalH = 0;

        for (int bananas : arr) {
            totalH += (long)(bananas + hourly - 1) / hourly;
        }

        return totalH;
    }
}