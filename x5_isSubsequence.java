public class x5_isSubsequence {
 public static void main(String[] args) {
  String s = "b";
  String t = "abc";
  System.out.println(isSubsequence(s, t));
 }

 public static boolean isSubsequence(String s, String t) {
  // boolean temp[] = new boolean[s.length() + 1];
  if (s.length() == 0) {
   return true;
  }
  int j = 0;
  for (int i = 0; i < t.length() && j < s.length();) {
   if (s.charAt(j) == t.charAt(i)) {
    j++;
    i++;
   } else {
    i++;
   }
  }

  return (j == s.length() ? true : false);
 }
}
