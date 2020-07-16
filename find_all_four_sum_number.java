import java.util.*;

class Result {
      Pair p1;
      Pair p2;

      Result(Pair p1, Pair p2) {
            this.p1 = p1;
            this.p2 = p2;
      }

      public void printResult() {
            System.out.println(this.p1.first + " " + this.p1.second + " " + this.p2.first + " " + this.p2.second);
      }
}

class Pair {
      int first;
      int second;

      Pair(int first, int second) {
            this.first = first;
            this.second = second;
      }
}

class CustomComparator implements Comparator<Result> {
      public int compare(Result result1, Result result2) {
            if (result1.p1.first == result2.p1.first) {
                  if (result1.p1.second == result2.p1.second) {
                        if (result1.p2.first == result2.p2.first) {
                              return result1.p2.second - result2.p2.second;
                        } else
                              return result1.p2.first - result2.p2.first;
                  } else
                        return result1.p1.second - result2.p1.second;
            } else
                  return result1.p1.first - result2.p1.first;
      }
}

class Main {

      static Set<Result> resultSet = new TreeSet<>(new CustomComparator());

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            Map<Integer, Set<Pair>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        int sum = arr[i] + arr[j];

                        if (map.containsKey(sum)) {
                              map.get(sum).add(new Pair(i, j));
                        } else {
                              Set<Pair> set = new HashSet<>();
                              set.add(new Pair(i, j));
                              map.put(sum, set);
                        }
                  }
            }

            for (Integer sum : map.keySet()) {
                  Set<Pair> value1 = map.get(sum);
                  Set<Pair> value2 = map.get(k - sum);

                  if (value2 == null) {
                        continue;
                  }

                  makePairs(arr, value1, value2);
            }

            print();
      }

      public static void makePairs(int[] arr, Set<Pair> value1, Set<Pair> value2) {
            for (Pair p1 : value1) {
                  for (Pair p2 : value2) {
                        if (p1.first != p2.first && p1.first != p2.second && p1.second != p2.first
                                    && p1.second != p2.second) {
                              int[] temp = { arr[p1.first], arr[p1.second], arr[p2.first], arr[p2.second] };
                              Arrays.sort(temp);
                              resultSet.add(new Result(new Pair(temp[0], temp[1]), new Pair(temp[2], temp[3])));
                        }
                  }
            }
      }

      public static void print() {
            for (Result result : resultSet) {
                  result.printResult();
            }
      }
}