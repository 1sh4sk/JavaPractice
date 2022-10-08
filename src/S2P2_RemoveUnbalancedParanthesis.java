import java.util.*;

public class S2P2_RemoveUnbalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string with unbalanced paranthesis:");
        String input = sc.next();

        char[] chars = input.toCharArray();

        int len = input.length();

        int open=0,close=0;

        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--){
                if(chars[i]=='('){
                    open++;
                }else if(chars[i]==')'){
                    open--;
                }else if(chars[j]==')'){
                    close++;
                }else if(chars[j]=='('){
                    close--;
                }
                if(open<0){
                    chars[i] = '0';
                    open = 0;
                }
                if(close<0){
                    chars[j] = '0';
                    close = 0;
                }
            }
        }

        for(int k=0;k<len;k++){
            if(chars[k]!='0'){
                System.out.print(chars[k]);
            }
        }




    }
}
