public class App {
    public static void main(String[] args) throws Exception {
        /**
         * You are given an m x n integer matrix matrix with the following two
         * properties:
         * 
         * Each row is sorted in non-decreasing order.
         * The first integer of each row is greater than the last integer of the
         * previous row.
         * 
         * Given an integer target, return true if target is in matrix or false
         * otherwise.
         * 
         * You must write a solution in O(log(m * n)) time complexity.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
         * Output: true
         * 
         * Example 2:
         * 
         * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
         * Output: false
         * 
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        int[][] matrix = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 16;
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("The given input 2d array is: " + arrayToString(matrix));
        System.out.println("Is the target value: " + target + " present in the 2d input array: " + result);

    }

    public static String arrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : array) {
            for (int element : row) {
                sb.append(element).append("\t"); // Using tab for spacing
            }
            sb.append("\n"); // New line at the end of each row
        }

        return sb.toString();
    }
}
