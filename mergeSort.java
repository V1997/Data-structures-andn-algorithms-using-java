import java.util.Arrays;

class mergeSort {

  public static void main(String[] args) {
    int arr[] = { 5, 2, 4, 1, 6 };
    System.out.println(Arrays.toString(implementMergeSort(arr, 0, arr.length - 1)));
  }

  public static int[] implementMergeSort(int arr[], int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      implementMergeSort(arr, start, mid);
      implementMergeSort(arr, mid + 1, end);
      mergeArrays(arr, start, mid, end);
    }
    return arr;
  }

  static void mergeArrays(int arr[], int start, int mid, int end) {
    int s1 = mid - start + 1;
    int s2 = end - mid;

    int[] a1 = new int[s1];
    int[] a2 = new int[s2];

    for (int i = 0; i < s1; i++) {
      a1[i] = arr[start + i];
    }
    for (int i = 0; i < s2; i++) {
      a2[i] = arr[mid + 1 + i];
    }
    int i = 0, j = 0, k = start;

    while (i < s1 && j < s2) {
      if (a1[i] < a2[j]) {
        arr[k++] = a1[i++];
      } else {
        arr[k++] = a2[j++];
      }
    }
    System.out.println(i + " k : " + k + s1);
    while (i < s1)
      arr[k++] = a1[i++];
    while (j < s2)
      arr[k++] = a2[j++];
  }
}
