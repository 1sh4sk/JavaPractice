import java.util.*;

public class S3P4_Substring {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        System.out.println("enter string");
        String ss = sc.next();

        System.out.println(isSubstring(s,ss));
    }

    private static int isSubstring(String s, String ss) {
        int i = 0,j = 0;
        int index = -1;

        while(i<s.length() && j < ss.length()){
            if(s.charAt(i) == ss.charAt(j)){
                index = i;
                i++;
                j++;
            }else{
                if(i<s.length()-ss.length()){
                    index = i;
                    i++;
                }else{
                    return -1;
                }
            }
        }

        return index-(ss.length()-1);
    }


}
