import java.util.*;

public class Modulus{
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int Z = read.nextInt();
        
        int P = 0;

        if(Z == 0){
            System.out.println("0");
        }
        else{


            for(int x = 0 ; x < N; x++){
                for(int y = 0 ; y < N; y++){
                    if((x * y)%N == Z){
                        P++;
                    }
    
                }
    
            }
            System.out.println(P);
        }
    }
}
