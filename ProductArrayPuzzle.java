import java.util.Arrays;

public class ProductArrayPuzzle {
    /**
     * Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
     *
     * Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
     *
     *
     * Input Format
     *
     * The only argument given is the integer array A.
     * Output Format
     *
     * Return the product array.
     * Constraints
     *
     * 2 <= length of the array <= 1000
     * 1 <= A[i] <= 10
     * For Example
     *
     * Input 1:
     *     A = [1, 2, 3, 4, 5]
     * Output 1:
     *     [120, 60, 40, 30, 24]
     *
     * Input 2:
     *     A = [5, 1, 10, 1]
     * Output 2:
     *     [10, 50, 5, 50]
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        ProductArrayPuzzle productArrayPuzzle=new ProductArrayPuzzle();
        System.out.println(Arrays.toString(productArrayPuzzle.solve(A)));
        A=new int[]{5,1,10,1};
        System.out.println(Arrays.toString(productArrayPuzzle.solve(A)));
    }

    public int[] solve(int[] A) {
        int N=A.length;
        //compute product of all array elements
        int product=1;

        for(int i=0;i<=N-1;i++)
        {
            product*=A[i];
        }

        for(int i=0;i<=N-1;i++)
        {
            A[i]=product/A[i];
        }

        return A;
    }
}
