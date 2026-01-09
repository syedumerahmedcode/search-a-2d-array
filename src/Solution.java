public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        /**
         * We consider the 2d matrix as one giant 1d array in theory and apply binary
         * search on it. This way, we get the target time complexity that we are aiming
         * for.
         * Also, we plan not to have an additional data structure and solve the problem
         * using the existing data staructure i.e. 2D array.
         */
        /**
         * row length
         * 
         */
        int m = matrix.length;
        /** column length */
        int n = matrix[0].length;

        /**
         * The first element in the matrix
         */
        int left = 0;
        /**
         * The last element in the matrix
         */
        int right = m * n - 1;
        while (left <= right) {
            /**
             * Finding the mid point in the current iteration within the 2D matrix
             */
            int mid = left + (right - left) / 2;
            /**
             * This is how we calculate the value within the 2d matrix using the mid point
             * calculated above
             */
            int midValue = matrix[mid / 2][mid % n];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                /**
                 * if current midvalue is less than target than the target lies on the right
                 * side of mid, hence. Increase left to mid +1. Why mid +1? Because current
                 * value of mid is not the target value and hence left should be updated to
                 * after the current mid value.
                 */
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        /**
         * Since we are now out of the loop, this means that the target value is not
         * present within the 2d array and hence we return false.
         */
        return false;
    }

}
