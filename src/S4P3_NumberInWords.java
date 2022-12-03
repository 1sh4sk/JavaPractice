import java.util.*;

public class S4P3_NumberInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number:");
        int n = sc.nextInt();

        System.out.println(numberInWords(n));
    }

    private static String numberInWords(int n) {
        String[] ones = {
                "",        "One",       "Two",      "Three",
                "Four",    "Five",      "Six",      "Seven",
                "Eight",   "Nine", };

        String[] teens = {
                "Ten", "Eleven", "Twelve",  "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};

        String[] tens = {
                "",      "",      "twenty",  "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        int count = 0;
        int temp = n;
        List<Integer> list = new ArrayList<>();
        while(temp > 0){
            int rem = temp%10;
            list.add(rem);
            temp = temp/10;
            count++;
        }
        System.out.println(count);
       if(count == 2){
           Collections.reverse(list);
            if(list.get(0)==1){
                if(list.get(1)==0){
                    return teens[list.get(0)];
                }
                    return teens[list.get(1)];
            }else{
                if(list.get(0)==2 && list.get(1)==0){
                    return tens[list.get(0)];
                }
                return tens[list.get(0)]+" "+ones[list.get(1)];
            }
        }else if(count == 3){
           Collections.reverse(list);
           if(list.get(0)==1 && list.get(1)==0 && list.get(2)==0){
               return "hundred";
           }else if(list.get(0)!=1 && list.get(1)==0 && list.get(2)==0){
               return ones[list.get(0)]+" hundred";
           }else if(list.get(1)==0){
               return ones[list.get(0)]+" hundred and "+ones[list.get(2)];
           }else if(list.get(2)==0){
               return ones[list.get(0)]+" hundred and "+tens[list.get(1)];
           }
           return ones[list.get(0)]+" hundred and "+tens[list.get(1)]+" "+ones[list.get(2)];
       } else {
           return ones[list.get(0)];
       }

    }
}
