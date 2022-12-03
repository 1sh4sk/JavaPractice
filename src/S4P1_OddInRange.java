import java.util.*;

public class S4P1_OddInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting range");
        int r1 = sc.nextInt();
        System.out.println("enter ending range");
        int r2 = sc.nextInt();

        int i = r1;
        while(i < r2){
            if(i%2!=0){
                System.out.print(i+ ",");
            }
            i++;
        }

    }
}
