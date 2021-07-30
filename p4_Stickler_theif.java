public class p4_Stickler_theif {
 public static void main(String[] args) {
  int[] arr = new int[] { 5, 5, 10, 100, 10, 5 };
  int n = arr.length;

  System.out.println(FindMaxSum(arr, n));
 }

 public static int FindMaxSum(int arr[], int n) {
  int ep = 0;
  int ip = arr[0];
  int ec = 0;
  int ic = arr[0];

  for (int i = 1; i < n; i++) {
   ec = Math.max(ep, ip);
   ic = ep + arr[i];
   ep = ec;
   ip = ic;
  }

  return Math.max(ec, ic);
 }
}
