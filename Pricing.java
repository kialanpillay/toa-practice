import java.util.*;
import java.text.DecimalFormat;

public class Pricing{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        long N = read.nextLong();
        long K = (long)(1.2 * Math.sqrt(N));
        long fK = 0;

        long[]arr = new long[(int)K+1];

        for(int j = 0; j < K+1; j++){
            arr[j] = j+1;
        }

        System.out.println(findK(arr, 0, K, N));
    }

    public static long computeK(long K){
        long S = 0;
        long U = (long)Math.rint(K/2) + 1;
        S += 0.5 * ((K-1) - U + 1) * ((K-1) + U);
        for(int j = 1; j < U; j++){
            S += j*(K/j);
        }
        return S;
    }

    public static long findK(long arr[], long l, long r, long N) 
    { 
        if (r >= l) { 
            int mid = (int)(l + (r - l) / 2); 
            long fK = computeK(arr[mid]);
            if (fK > N){ 
                return findK(arr, l, mid - 1, N); 
            }    
            return findK(arr, mid + 1, r, N); 
        } 
        return l; 
    } 
}
