import java.util.*;

public class Modulus{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int Z = read.nextInt();
        
        int P = 0;

        for(int x = 1 ; x < N; x++){
            for(int y = 1 ; y < N; y++){
                if((x * y)%N == Z){
                    P++;
                }

            }

        }
        System.out.println(P);
        }
    }
}
