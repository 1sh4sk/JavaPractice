import java.util.Scanner;

public class S2P1_FirstmaxSecmin {
    int[] SortArray(int[] arr, int n){

        int temp;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the integer array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");

        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("entered elements are:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        S2P1_FirstmaxSecmin ob = new S2P1_FirstmaxSecmin();
        int[] sortedarr = ob.SortArray(arr,n);

        System.out.println();
        System.out.println("sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(sortedarr[i]+" ");
        }

        System.out.println();
        System.out.println("output:");
        int i=0,j=n-1;
        while(i<j){
            System.out.print(sortedarr[j--]+" ");
            System.out.print(sortedarr[i++]+" ");
        }
        if(n%2!=0){
            System.out.println(sortedarr[i]);
        }


    }
}
