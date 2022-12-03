import java.util.*;

public class S3P5_MergeUnique {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(("enter first array size:"));

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("enter First array elements:");
        for( int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println(("enter second array size:"));
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("enter Second array elements:");
        for( int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        mergeUnique(arr1,n1,arr2,n2);
    }

    private static void mergeUnique(int[] arr1, int n1, int[] arr2, int n2) {
        List<Integer> op = new ArrayList<>();
        int i = 0, j = 0;

        while(i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                op.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                op.add(arr1[i]);
                i++;
            }else{
                op.add(arr2[j]);
                j++;
            }
        }

        while(i < n1){
            op.add(arr1[i]);
            i++;
        }

        while(j < n2){
            op.add(arr2[j]);
            j++;
        }
        System.out.println("Merged unique element");
        System.out.println(op);

        for(Integer item:op){
            System.out.print( op.get(item)+" ");
        }
    }


}
