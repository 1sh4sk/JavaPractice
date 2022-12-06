import java.util.*;

public class S4P1L2_SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N value:");
        int n = sc.nextInt();;
        System.out.println("enter M value:");
        int m = sc.nextInt();

        int rs = 0;
        int cs = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int min = Math.min(Math.min(i,j),Math.min(n-i-1,m-j-1));
                if(min == 1){
                    System.out.print("O ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
