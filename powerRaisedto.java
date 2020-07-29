public class powerRaisedto {

  public static void main(String[] args) {
    RecursivePower(5, 2);
  }

  static int RecursivePower(int n, int p) {
    if (p == 0) {
      return 1;
    }
    return n * RecursivePower(n, p - 1);
  }
}
