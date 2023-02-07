package utils;

public class evensum {

    public static void main (String[] args){
        int[]arr = {3,5,7,8};
        int result = maxEvenSum(arr);
        System.out.println((result));
    }

    public static int maxEvenSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i : arr) {
            curSum += i;
            if (curSum % 2 == 0 && curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum <= 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }

}
