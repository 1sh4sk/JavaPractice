import java.util.*;

public class S3P2_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[]  in = new int[n];
        for(int i =0; i<n;i++){
            in[i]=sc.nextInt();
        }

        Arrange(in,n);

    }

    private static void Arrange(int[] in, int n) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();


        for(int i = 0; i < n; i++){
            if(i%2==0){
                arr1.add(in[i]);
            }else{
                arr2.add(in[i]);
            }
        }


        Collections.sort(arr1);
        Collections.reverse(arr1);
        Collections.sort(arr2);


        merge(arr1,arr2,n);

    }

    private static void merge(List<Integer> arr1, List<Integer> arr2,int n) {
        int[] op = new int[n];
        int i=0,j=0,k=0;
        int l1 = arr1.size();
        int l2 = arr2.size();

        while (i < l1 && i < l2) {
            op[k] = arr1.get(i);
            op[k+1] = arr2.get(i);
            i++;
            j++;
            k+=2;
        }

        while(i<l1){
            op[k] = arr1.get(i);
            i++;
            k++;
        }

        while(i<l2){
            op[k] = arr2.get(i);
            i++;
            k++;
        }

        System.out.println("output:");
        for(int l = 0; l < n;l++){
            System.out.print(op[l]+" ");;
        }

    }



}
