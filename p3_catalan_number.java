import java.math.BigInteger;

public class p3_catalan_number {
 public static void main(String[] args) {
  int n = 7;
  System.out.println(findCatalan(n));
 }

 public static BigInteger findCatalan(int n) {
  BigInteger b = new BigInteger("1");

  for (int i = 1; i <= n; i++) {
   b = b.multiply(BigInteger.valueOf(i));
  }

  // calculating n! * n!
  b = b.multiply(b);

  BigInteger d = new BigInteger("1");

  // calculating (2n)!
  for (int i = 1; i <= 2 * n; i++) {
   d = d.multiply(BigInteger.valueOf(i));
  }

  // calculating (2n)! / (n! * n!)
  BigInteger ans = d.divide(b);

  // calculating (2n)! / ((n! * n!) * (n+1))
  ans = ans.divide(BigInteger.valueOf(n + 1));
  return ans;
 }
}
