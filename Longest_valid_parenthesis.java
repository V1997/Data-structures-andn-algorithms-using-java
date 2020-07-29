import java.util.*;

class Longest_valid_parenthesis {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Stack<Character> str = new Stack<>();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {

                  if (s.charAt(i) == ')' && !str.isEmpty() && s.charAt(i) != str.peek()) {
                        sum = sum + 2;
                        str.pop();
                  } else {
                        str.push(s.charAt(i));
                  }
            }
            System.out.println(sum);
      }
}