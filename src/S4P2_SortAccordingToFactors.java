import java.util.*;

public class S4P2_SortAccordingToFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of array elements");
        int n = sc.nextInt();

        System.out.println("enter elements");
        int[] in = new int[n];
        for(int i = 0; i < n; i++){
            in[i] = sc.nextInt();
        }

        sortDesc(in,n);
    }

    private static void sortDesc(int[] in, int n) {
        List<Integer> factCount = new ArrayList<>();
        for(int i = 0; i < n; i++){
            factCount.add(factors(in[i]));
        }

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(factCount.get(j) > factCount.get(j-1)){
                    Collections.swap(factCount,j,j-1);
                    int temp = in[j];
                    in[j] = in[j-1];
                    in[j-1] = temp;

                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(in[i]+ " ");
        }
    }

    private static int factors(int n) {
        int count = 0;

        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(n/i == i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }

        return count;
    }


}
