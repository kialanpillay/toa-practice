import java.util.*;

public class Scoring{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int[]V = new int[N];

        for(int i = 0; i < N; i++){
            V[i] = read.nextInt();
        }
        int T = read.nextInt();
        int MAX = 1;

        int[] operators = new int[N];

        for(int i = 0 ; i < Math.pow(2,N) ; i++){
            int temp = i;
            for(int j = 0 ; j < N ; j++){
                operators[j] = temp % 2;
                temp /= 2;
            }     

            int S = 1;
            for(int j = 0 ; j < N; j++){
                if(operators[j] == 0){
                    S+=V[j];
                }
                else{
                    S*=V[j];
                }
            }
            if(S > MAX && S < T){
                MAX = S;
            }
  
        }
        System.out.println(MAX);
    }
}
