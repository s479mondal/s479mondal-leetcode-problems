class Solution {
    public int longestSubstring(String s, int k) {
        return solve(s, 0, s.length(), k);
    }

    public int solve(String s, int start, int end, int k) {

        if (end - start < k) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = start; i < end; i++) {
            char c = s.charAt(i);

            if (map.get(c) < k) {

                int left = solve(s, start, i, k);
                int right = solve(s, i + 1, end, k);

                return Math.max(left, right);
            }
        }

        return end - start;
    }
}