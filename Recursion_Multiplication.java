public class Recursion_Multiplication {

  public static void main(String[] args) {
    System.out.println(Multiply_by_recursion(10, 5));
  }

  static int Multiply_by_recursion(int m, int n) {
    if (n == 0 || m == 0) {
      return 0;
    }
    if (m == 1) {
      return n;
    }
    
    return n + Multiply_by_recursion(n, m - 1);
  }
}
