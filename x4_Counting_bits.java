//Bit manipulation

public class x4_Counting_bits {

 public static void main(String[] args) {
  int n = 8;
  int[] ans = countBits(n);
  for (int x : ans) {
   System.out.print(x + " ");
  }
 }

 public static int[] countBits(int n) {
  int[] ans = new int[n + 1];
  ans[0] = 0;
  for (int i = 1; i <= n; i++) {
   if (i % 2 == 0) {
    ans[i] = ans[i / 2];
   } else {
    ans[i] = ans[i - 1] + 1;
   }
  }

  return ans;
 }
}