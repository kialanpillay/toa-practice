import java.util.*;

public class Path{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int K = read.nextInt();
        int[][]grid = new int[N][N];

        for(int i = 0; i < K; i++){
            int x = read.nextInt();
            int y = read.nextInt();
            grid[x-1][y-1] = -1;
        }

        long P = 0;
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                if(grid[x][y] == -1){
                    if(y == 0 && x < N -1){
                        grid[x+1][y] = -1;
                    }
                    if(x == 0 && y < N -1){
                        grid[x][y+1] = -1;
                    }
                    continue;
                }
                if(x == 0 || y == 0){
                    grid[x][y] = 1;
                }
                else{
                    if(grid[x-1][y] == -1 && grid[x][y-1] == -1){
                        grid[x][y] = 0;
                    }
                    else if(grid[x-1][y] == -1){
                        grid[x][y] = grid[x][y-1];
                    }
                    else if(grid[x][y-1] == -1){
                        grid[x][y] = grid[x-1][y];
                    }
                    else{
                        grid[x][y] = grid[x-1][y] + grid[x][y-1];
                    }
                    
                }
            }
        }
        P = grid[N-1][N-1];
        System.out.println(P);
    }
}
