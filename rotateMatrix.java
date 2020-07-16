import java.util.Scanner;
public class rotateMatrix{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        int matrix[][] = new int[matrixSize][matrixSize];
        for(int i = 0; i < matrixSize; i++){
            for(int j = 0; j < matrixSize; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // 90 degree rotate
        for(int k = 0; k < matrixSize; k++){
            for(int m = (matrixSize-1); m >= 0; m--){
                System.out.print(matrix[m][k] + " ");
            }   
            System.out.println();
        }
        System.out.println();
        // 180 degree rotate
        for(int c = (matrixSize-1); c >= 0 ; c--){
            for(int n = (matrixSize-1); n >= 0; n--){
                System.out.print(matrix[c][n] + " ");
            }   
            System.out.println();
        }
        sc.close();
    }
}