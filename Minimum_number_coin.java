import java.io.BufferedReader;
import java.util.*;

public class Minimum_number_coin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int total = sc.nextInt();
    int currency[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
    int nums[] = new int[total];
    for (int i = 0; i < total; i++) {
      nums[i] = sc.nextInt();
      System.out.println(getResult(nums[i], currency));
    }
    sc.close();
  }

  static int getResult(int nums, int currency[]) {
    int count = 0;
    for (int i = (currency.length - 1); i >= 0; --i) {
      if (nums >= currency[i]) {
        count = count + nums / currency[i];
        nums = nums % currency[i];
      } else {
        continue;
      }
    }
    return count;
  }
}
