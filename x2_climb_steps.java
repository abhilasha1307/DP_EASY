public class x2_climb_steps {
 public static void main(String[] args) {
  System.out.println(memo(5));
 }

 public static int climbStairs(int n) {
  int[] dp = new int[n + 1];
  dp[0] = 0;
  dp[1] = 1;
  dp[2] = 2;

  for (int i = 3; i <= n; i++) {
   dp[i] = dp[i - 1] + dp[i - 2];
  }
  return dp[n];
 }

 public static int memo(int n) {
  int[] dp = new int[n + 1];
  return Util(0, n, dp);
 }

 private static int Util(int i, int n, int[] dp) {
  if (i > n)
   return 0;

  if (i == 1)
   return 1;

  if (i == 2)
   return 2;

  if (dp[i] > 0) {
   return dp[i];
  }
  dp[i] = Util(i + 1, n, dp) + Util(i + 2, n, dp);
  return dp[i];
 }

}
