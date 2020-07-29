import java.util.*;
import java.io.*;
class next_large_element{
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < size; i++){

           int val = Integer.parseInt(s[i]);
           for(int j = i + 1; j < size; j++){
               int value = Integer.parseInt(s[j]);
               if(value > val){
                   val = value;
                   break;
               }
           }
           if(i == size-1 || val == Integer.parseInt(s[i])){
               st.push(-1);
           }
           else{
               st.push(val);
           }
        }
        for(Object o : st){
            System.out.print(o + " ");
        }
    }
}