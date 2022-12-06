public class test {
    public static void main(String[] args)
    {
        int number = 1;
        for(int i =0;i<7;++i)
        {
            System.out.println(number);
            number = caculateNextNumber(number);
        }

    }
    public static int caculateNextNumber(int number)
    {
        int digit=0;
        int newNumber=0;
        int multiplier = 1;
        while(number> 0)
        {
            int count=0;
            do{
                digit = number%10;
                number = number/10;
                count++;
            }while(digit==number%10);
            newNumber=newNumber+(count*10+digit)*multiplier;
            multiplier*=100;
        }
        return newNumber;
    }
}
