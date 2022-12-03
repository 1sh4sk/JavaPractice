import java.util.*;

public class S3P3_XPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input String");
        String in = sc.next();

        for(int i= 0; i < in.length(); i++){
            for(int j = 0; j < in.length(); j++){
                if(i==j || i+j == in.length()-1){
                    System.out.print(in.charAt(j)+ " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
