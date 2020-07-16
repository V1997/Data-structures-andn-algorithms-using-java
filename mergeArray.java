import java.util.*;
class mergeArray{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ArrForN[] = new int[N];
        for(int i = 0; i < N; i++){
            ArrForN[i] = sc.nextInt();
        }
        int ArrForM[] = new int[M];
        for(int j = 0; j < M; j++){
            ArrForM[j] = sc.nextInt();
        }
        
        int result[] = new int[M+N];
//        int k = 0;
        int x = 0;
        int i = 0;
        int j = 0;
        while(x < M+N){
            if(i < N){
                result[x] = ArrForN[i];
                i++;
                x++;
            }else{
                result[x] = ArrForM[j];
                j++;
                x++;
            }  
        }      

        Arrays.sort(result);
        for(int l = 0; l < result.length; l++){
            if(l == result.length-1){
                System.out.print(result[l]);
            }
            else{
                System.out.print(result[l]+" ");
            }
            
        }
    }
}