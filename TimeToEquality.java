public class TimeToEquality {
    /**
     * Problem Description
     *
     * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
     *
     * Find the minimum time in seconds to make all elements of the array equal.
     *
     *
     * Problem Constraints
     *
     * 1 <= N <= 1000000
     * 1 <= A[i] <= 1000
     *
     *
     * Input Format
     *
     * First argument is an integer array A.
     *
     *
     * Output Format
     *
     * Return an integer denoting the minimum time to make all elements equal.
     *
     *
     * Example Input
     *
     * A = [2, 4, 1, 3, 2]
     *
     *
     * Example Output
     *
     * 8
     *
     *
     * Example Explanation
     *
     * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        int[]A={2,4,1,3,2};
        TimeToEquality timeToEquality=new TimeToEquality();
        System.out.println(timeToEquality.solve(A));
    }

    public int solve(int[] A)
    {
        int N=A.length;
        //find max1
        int max1=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<=N-1;i++)
        {
         if(A[i]>max1)
             max1=A[i];
        }

        //compute sum of differences from max1
        for(int i=0;i<=N-1;i++)
        {
            sum+=max1-A[i];
        }
        return sum;
    }
}
