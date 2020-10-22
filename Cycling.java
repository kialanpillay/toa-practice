import java.util.*;

public class Cycling{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int[]P = new int[N];

        for(int i = 0; i < N; i++){
            P[i] = read.nextInt();
        }

        int[][]SS = new int[N][N];

        int max = 0;

        for(int y = 0; y < N; y++){
            for(int x = 0; x < N; x++){
                if(x == 0){
                    SS[y][x] = 0 + P[(y+x)%N];
                }
                else if (y+x >= N) {
                    SS[y][x] = SS[y][x-1];
                }
                else{
                    SS[y][x] = SS[y][x-1] + P[(y+x)%N];
                }
                if(SS[y][x] > max){
                    max = SS[y][x];
                }
            }
        }
        System.out.println(max);
    }
}
