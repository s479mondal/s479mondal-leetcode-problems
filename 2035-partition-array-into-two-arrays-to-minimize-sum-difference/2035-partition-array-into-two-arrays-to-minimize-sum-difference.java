class Solution {

    public int minimumDifference(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        // Split array into two halves
        int[] left = new int[half];
        int[] right = new int[half];

        for (int i = 0; i < half; i++) {
            left[i] = nums[i];
            right[i] = nums[i + half];
        }

        // Generate all subset sums grouped by number of elements
        ArrayList<Integer>[] lsum = new ArrayList[half + 1];
        ArrayList<Integer>[] rsum = new ArrayList[half + 1];

        for (int i = 0; i <= half; i++) {
            lsum[i] = new ArrayList<>();
            rsum[i] = new ArrayList<>();
        }

        generate(left, 0, 0, 0, lsum);
        generate(right, 0, 0, 0, rsum);

        // Sort right subset sums
        for (int i = 0; i <= half; i++) {
            Collections.sort(rsum[i]);
        }

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int ans = Integer.MAX_VALUE;

        // Choose k elements from left
        // Then choose half-k elements from right
        for (int k = 0; k <= half; k++) {

            for (int x : lsum[k]) {

                int need = half - k;

                // We want:
                // x + y close to total / 2

                double target = (total / 2.0) - x;

                ArrayList<Integer> list = rsum[need];

                int index = Collections.binarySearch(
                    list,
                    (int) Math.ceil(target)
                );

                if (index < 0) {
                    index = -index - 1;
                }

                // Check index
                if (index < list.size()) {
                    int subsetSum = x + list.get(index);
                    ans = Math.min(ans,
                            Math.abs(total - 2 * subsetSum));
                }

                // Check previous index
                if (index > 0) {
                    int subsetSum = x + list.get(index - 1);
                    ans = Math.min(ans,
                            Math.abs(total - 2 * subsetSum));
                }
            }
        }

        return ans;
    }

    private void generate(
        int[] nums,
        int index,
        int count,
        int sum,
        ArrayList<Integer>[] result
    ) {
        if (index == nums.length) {
            result[count].add(sum);
            return;
        }

        // Don't take current element
        generate(nums, index + 1, count, sum, result);

        // Take current element
        generate(
            nums,
            index + 1,
            count + 1,
            sum + nums[index],
            result
        );
    }
}