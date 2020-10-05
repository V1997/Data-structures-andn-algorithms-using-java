//==== Problem statement =====//
/*


You are given two integer arrays A and B of sizes N and M respectively. You need to modify the elements of A so that B becomes its subarray. Modifying an element means change the element to any other value.

Find the minimum number of modifications to achieve this.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N space separated integers, the elements of array A.
The third line of the input contains M space separated integers, the elements of array B.

Constraints
1 <= M <= N <= 500
1 <= A[i], B[i] <= 10
Output
Output a single integer, the minimum number of modifications in A to make B its subarray.

Sample Input
6 3
3 1 2 1 3 3
1 2 3

Sample Output
1

Explanation: If you modify A[4] from 1 to 3. A[2]. A[4] represents the array B, so B is its subarray.

Sample Input
10 5
3 4 5 3 4 3 1 3 5 2 
1 4 4 4 3 

Sample Output
3

*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class subArray {
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		int M_arr[] = new int[M];
		for(int i = 0; i < M; i++){
			M_arr[i] = sc.nextInt();
		}

		int N_arr[] = new int[N];
		for(int i = 0; i < N; i++){
			N_arr[i] = sc.nextInt();
		}

		int minCount = N;
        for(int i = 0; i < M_arr.length; i++){
            int count = 0;
            int k = 0;
            if(i+N > M_arr.length){
                break;
            }
            for(int j = i; j < i + N; j++){
                if(N_arr[k] != M_arr[j]){
                    count++;
                }
                k++;
            }
            minCount = Math.min(minCount, count);
        }
		System.out.println(minCount);       
	}
}