import java.util.*;

public class S3P4_ReverseUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in =  sc.nextLine();
        String[] arr = in.split(" ");

        reverseUsingRecursion(arr,arr.length-1);

    }

    private static void reverseUsingRecursion(String[] arr,int i) {
        if(i < 0){
            return;
        }
        System.out.print(arr[i]+" ");
        reverseUsingRecursion(arr,--i);
    }


}
