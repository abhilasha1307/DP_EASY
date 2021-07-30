/*
PROBLEM:)
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

EXAMPLE:)
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

/*
APPROACH 1:) WITH DP


*/
public class x1_Maximum_subarray {

 public static void main(String[] args) {
  int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
  System.out.println(maxSubArray(arr));
  System.out.println(Kadanesalgo(arr));
 }

 public static int maxSubArray(int[] arr) {
  if (arr.length == 0) {
   return 0;
  }

  int ans = arr[0];
  int[] dp = new int[arr.length + 1];
  dp[0] = arr[0];

  for (int i = 1; i < arr.length; i++) {
   dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
   ans = Math.max(ans, dp[i]);
  }
  return ans;
 }

 public static int Kadanesalgo(int[] arr) {
  int max = 0;
  int result = Integer.MIN_VALUE;

  for (int i = 0; i < arr.length; i++) {
   max += arr[i];
   if (max > result) {
    result = max;
   }
   if (max < 0) {
    max = 0;
   }
  }

  return result;
 }

}
