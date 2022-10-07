import java.util.Scanner;

public class S1P1_PatternX {
    public static void main(String[] args){
        System.out.println("enter a odd character string:");
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int size = s.length();
        System.out.println(s);

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                if(i==j||i+j==size-1) {
                    System.out.print(s.charAt(j)+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
