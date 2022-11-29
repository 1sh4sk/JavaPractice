import java.util.*;


public class S3P1_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int len =  input.length();

        int i = 1;
        while(i<=len) {
            if (i<len-1 && Character.isDigit(input.charAt(i + 1))) {
                int n1 = Integer.parseInt(String.valueOf(input.charAt(i)));
                int n2 = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                int temp = (n1 * 10) + n2;
                for (int j = 0; j < temp; j++) {
                    System.out.print(input.charAt(i - 1));
                }

                i += 3;
            } else {
                int temp = Integer.parseInt(String.valueOf(input.charAt(i)));

                for (int j = 0; j < temp; j++) {
                    System.out.print(input.charAt(i - 1));
                }
                i += 2;
            }
        }
    }
}
