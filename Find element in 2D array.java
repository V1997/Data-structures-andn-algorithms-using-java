import java.util.*;
class Find_element_in_2D_array{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int Q = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < M*N; i++){
            al.add(sc.nextInt());
        }
        while(Q-- > 0){
            int val = sc.nextInt();
                if(al.contains(val)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            sc.close();
    }
}