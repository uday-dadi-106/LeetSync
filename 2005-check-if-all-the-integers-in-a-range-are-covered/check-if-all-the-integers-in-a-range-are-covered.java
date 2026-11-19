
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        boolean[] visited = new boolean[51];

        // Mark all covered integers
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                visited[i] = true;
            }
        }

        // Check every integer from left to right
        for (int i = left; i <= right; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }
}
