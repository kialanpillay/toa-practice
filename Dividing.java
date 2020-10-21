import java.util.*;
import java.text.DecimalFormat;

public class Dividing{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();

        int[]L = new int[N];

        int MAX = 0;

        for(int j = 0; j < N; j++){
            L[j] = read.nextInt();
            if(L[j] > MAX){
                MAX = L[j];
            }
        }

        int[]arr = new int[MAX];

        for(int j = 0; j < MAX; j++){
            arr[j] = j+1;
        }

        int K = read.nextInt();

        System.out.println(findK(arr, 0, MAX, K, L));
    }

    public static int computeP(int L[], int M){
        int P = 0;
        for(int l = 0; l < L.length; l++){
            P += L[l]/M;
        }
        return P;
    }

    public static int findK(int arr[], int l, int r, int K, int L[]) 
    { 
        if (r >= l) { 
            int M = (l + (r - l) / 2); 
            int P = computeP(L, arr[M+1]);
            if(P == K){
                return arr[M+1];
            }
            if (P < K){ 
                return findK(arr, l, M - 1, K, L); 
            }    
            return findK(arr, M + 1, r, K, L); 
        } 
        return l; 
    } 
}
