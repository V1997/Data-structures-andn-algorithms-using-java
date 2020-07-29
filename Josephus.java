public class Josephus {

  public static void main(String[] args) {
    safe_Position(10, 2);
  }

  public static int safe_Position(int n, int k) {
    if (n == 1) return 1; else return (safe_Position(n - 1, k) + k - 1) % n + 1;
    // (3, 2)
    // (safe_Position(2, 2) + 1) % 4
    // (safe_Position(1, 2) + 1) % 3
    // (1 + 1) % 3 => 2
    // 3 % 4
    // 3
  }
}
