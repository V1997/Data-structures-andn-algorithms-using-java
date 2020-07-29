
import java.util.*;

public class generate_binary_numbers {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Queue<String> q = new ArrayDeque<>();
            q.add("1");

            int i = 1;
            while (i++ <= n) {
                  q.add(q.peek() + '0');
                  q.add(q.peek() + '1');

                  System.out.print(q.poll() + ' ');
            }
      }
}
