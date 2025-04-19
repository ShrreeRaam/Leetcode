class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;   // Track the maximum number of 1s
        int rowIndex = 0;  // Track the row index with maximum 1s

        // Iterate through the rows
        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            // Iterate through each column in the row
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];  // Count the 1s in the row
            }

            // Update the row index and the maxOnes if the current row has more 1s
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }

        // Return the row index and the maximum number of 1s in that row
        return new int[] { rowIndex, maxOnes };
    }
}
