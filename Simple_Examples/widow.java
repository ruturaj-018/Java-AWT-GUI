class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minAbs = Integer.MAX_VALUE;
        int negCount = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negCount++;
                sum += Math.abs(val);
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }

        if (negCount % 2 == 0) {
            return sum;
        } else {
            return sum - 2L * minAbs;
        }
    }
}

