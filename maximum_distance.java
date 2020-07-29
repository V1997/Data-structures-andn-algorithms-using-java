import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximum_distance {
      public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine());
            int arr[] = { 5, 7, 11 };
            boolean flag = false;
            while (n >= 5) {
                  for (int i = (arr.length - 1); i >= 0; i--) {
                        if (n % arr[i] == 0) {
                              flag = true;
                              break;
                        } else {
                              continue;
                        }
                  }
                  if (flag == true) {
                        System.out.println(n);
                        break;
                  }else{
                        n--;
                  }
            }
      }
}