import java.sql.SQLOutput;
import java.util.Scanner;

public class S1P2_SortingNumberWeights {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[100];
        int[] wt = new int[100];

        System.out.println("enter the length of the array:");
        int n = sc.nextInt();
        System.out.print("enter the numbers:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("entered numbers are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n;i++){
            int sr= (int)Math.sqrt(arr[i]);
            if((sr*sr)==arr[i]){
                wt[i]=5;
            }
            else if(arr[i]%4==0&&arr[i]%6==0){
                wt[i]=4;
            }
            else if(arr[i]%2==0){
                wt[i]=3;
            }
        }

        System.out.println();

        System.out.println("numbers with weights are:");
        for(int i=0;i<n;i++){
            System.out.print("<"+arr[i]+","+wt[i]+">");
        }

        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(wt[i]>wt[j]){
                   int t1=wt[i];
                   wt[i]=wt[j];
                   wt[j]=t1;

                   int t2=arr[i];
                   arr[i]=arr[j];
                   arr[j]=t2;
               }
           }
        }

        System.out.println();
        System.out.println("numbers with sorted weights are:");
        for(int i=0;i<n;i++){
            System.out.print("<"+arr[i]+","+wt[i]+">");
        }




    }
}
