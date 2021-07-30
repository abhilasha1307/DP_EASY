public class p2_permutation_coeff {
 public static void main(String[] args) {
  int n = 5;
  int k = 2;

  System.out.println(Permutuation(n, k));
  System.out.println(Rec(n, k));
  System.out.println(Perm_space(n, k));
  System.out.println(perm_Optimal(n, k));
 }

 // bottom up (no space optimization)
 public static int Permutuation(int n, int k) {

  int p[][] = new int[n + 2][k + 2];

  for (int i = 0; i <= n; i++) {
   for (int j = 0; j <= Math.min(i, k); j++) {
    if (j == 0) {
     p[i][j] = 1;
    }

    else {
     p[i][j] = p[i - 1][j] + j * p[i - 1][j - 1];
    }

    p[i][j + 1] = 0;
   }
  }

  return p[n][k];
 }

 public static int Perm_space(int n, int k) {
  if (n < k)
   return 0;
  int[] factorial = new int[n + 1];
  factorial[0] = 1;
  for (int i = 1; i <= n; i++) {
   factorial[i] = i * factorial[i - 1];
  }
  return (factorial[n] / factorial[n - k]);
 }

 public static int perm_Optimal(int n, int k) {
  if (n < k)
   return 0;
  int Fn = 1, Fk = 1;
  for (int i = 1; i <= n; i++) {
   Fn *= i;
   if (i == n - k) {
    Fk = Fn;
   }
  }
  return (Fn / Fk);
 }

 public static int Rec(int n, int k) {
  if (k == 0) {
   return 1;
  }

  if (n < k) {
   return 0;
  }

  if (n == k) {
   return Fact(n);
  }

  else {
   return (k * Rec(n - 1, k - 1) + Rec(n - 1, k));
  }
 }

 public static int Fact(int n) {
  if (n == 0 || n == 1) {
   return 1;
  }

  else {
   return n * Fact(n - 1);
  }
 }
}
