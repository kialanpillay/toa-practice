import java.util.*;
import java.text.DecimalFormat;

public class Dividing{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int[]L = new int[N];
        long sum = 0;

        for(int j = 0; j < N; j++){
            L[j] = read.nextInt();
            sum+=L[j];
        }

        int K = read.nextInt();
        int UB, LB;
        if(sum/K > L.length){
            UB = (int)(sum/K) + 1;
            LB = L.length;
        }
        else{
            UB = L.length;
            LB = (int)(SUM/K) + 1;
        }

        int[]arr = new int[UB - LB];

        for(int j = 0; j < arr.length; j++){
            arr[j] = j + LB;
        }
        System.out.println(findK(arr, 0, UB - LB - 1, K, L));
    }

    public static int computeP(int L[], int M, int K){
        int P = 0;
        for(int l = 0; l < L.length; l++){
            P += L[l]/M;
            if(P > K){
                break;
            }
        }
        return P;
    }

    public static int findK(int arr[], int l, int r, int K, int L[]) 
    { 
        if (r >= l) { 
            int M = (l + (r - l) / 2); 
            int P = computeP(L, arr[M], K);
            if(P == K){
                if(M == r){
                    return arr[M];
                }
                while(P == K){
                    M++;
                    P = computeP(L, arr[M], K);
                }
                return arr[M-1];
            }
            if (P < K){ 
                return findK(arr, l, M - 1, K, L); 
            }    
            return findK(arr, M + 1, r, K, L); 
        } 
        return arr[l-1]; 
    } 
}
