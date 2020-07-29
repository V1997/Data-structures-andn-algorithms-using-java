import java.util.Scanner;

public class Transpose {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matrixSize = sc.nextInt();
    int matrix[][] = new int[matrixSize][matrixSize];
    for (int i = 0; i < matrixSize; i++) {
      for (int j = 0; j < matrixSize; j++) {
        matrix[i][j] = sc.nextInt();
        //    System.out.print(matrix[i][j]);
      }
    }
    for (int k = 0; k < matrixSize; k++) {
      for (int l = 0; l < matrixSize; l++) {
        System.out.print(matrix[l][k] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
