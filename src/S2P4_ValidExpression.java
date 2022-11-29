import java.util.*;

public class S2P4_ValidExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Stack<String> stk = new Stack<>();

        System.out.println("enter the expression");
        String input = sc.next();

        int len = input.length();
        int t =0,j=0;

        for(int i=0;i<len;i++){
            char temp = input.charAt(i);
            if(temp == '('){
//                stk.push(String.valueOf(temp));
                t++;
            }else if(temp == ')'){
                t--;
            }else if(temp == '*' || temp == '+' || temp == '-' || temp == '/' || temp == '%'){
                if(input.charAt(i-1)>=(char)('a'+0) &&input.charAt(i-1)<(char)('a'+26) &&input.charAt(i+1)>=(char)('a'+0) && input.charAt(i+1)<(char)('a'+26)){

                }else{
                    break;
                }
            }


            j=i+1;
        }
        if(j==len && t==0){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

    }
}
