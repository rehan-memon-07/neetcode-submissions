class Solution {
    public int[] sortArray(int[] nums) {

        int[] ans = new int[nums.length];
        boolean[] visited = new boolean[nums.length];

        int pos = 0;   

        while (pos < nums.length) {

            int check = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < nums.length; j++) {

                if (visited[j]) {
                    continue;
                }

                if (nums[j] < check) {
                    check = nums[j];
                    index = j;
                }
            }

            ans[pos] = check;
            visited[index] = true;
            pos++;
        }

        return ans;
    }
}