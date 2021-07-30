public class p1_max_product_subarray {
 public static void main(String[] args) {
  int N = 5;
  int Arr[] = { -8, 5, 3, 1, 6 };

  System.out.println((maxProductSubarray(Arr, N)));
 }

 public static long maxProductSubarray(int[] arr, int N) {
  long MaxProduct = arr[0];
  long MaxVal = arr[0];
  long MinVal = arr[0];

  for (int i = 1; i < N; i++) {
   if (arr[i] < 0) {
    long temp = MaxVal;
    MaxVal = MinVal;
    MinVal = temp;
   }
   MaxVal = Math.max(arr[i], MaxVal * arr[i]);
   MinVal = Math.min(arr[i], MinVal * arr[i]);

   MaxProduct = Math.max(MaxProduct, MaxVal);
  }

  return MaxProduct;
 }
}
