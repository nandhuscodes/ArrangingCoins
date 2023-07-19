import java.util.Scanner;

public class ArrangingCoins {
    static int findNoOfCompleteStairCase(int N){
        int  temp = N, completeStairs = 0;
        for(int i = 1; i <= N; i++){
            temp -= i;
            if(temp <= 0){
                break;
            }else{
                completeStairs++;
            }
        }
        return completeStairs;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(findNoOfCompleteStairCase(N));
    }
}
