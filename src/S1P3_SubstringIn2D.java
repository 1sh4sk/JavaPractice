import java.util.*;

public class S1P3_SubstringIn2D{
    //print function
    void print(int i,int j,int len,int k){
        System.out.println("<"+i+","+j+">");
        if(k==0)  //PRINT INDEX OF ROW
            System.out.println("<"+i+","+(j+(len-1))+">");
        else       //PRINT INDEX OF COL
            System.out.println("<"+(i+len)+","+j+">");
    }

    //row search
    void Rsearch(char arr[][],int d,String sr,int j){
        for (int i=0;i<d-sr.length();i++){
            String str="";
            for(int k=i;k<i+sr.length();k++){
                str+=arr[j][k];
            }
            if(str.equals(sr)){
                print(j,i,sr.length(),0);
            }
        }
        if(j<d-1)
        {
            Rsearch(arr,d,sr,++j);
        }
    }


    //column search
    void Csearch(char arr[][],int d,String sr,int j)
    {
        //column wise search
        for(int i=0;i<=(d-sr.length());i++)
        {    String s="";
            for(int k=i;k<i+sr.length();k++){
                s+=arr[k][j];
            }
            if(s.equals(sr))
            {
                print(i,j,sr.length(),1);
            }
        }
        if(j<d-1)
        {
            Csearch(arr,d,sr,++j);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        char arr[][] = new char[10][10];

        System.out.println("Enter the input string:");
        String s = sc.next();
        System.out.println("Enter the substring to find:");
        String sr = sc.next();

        int d=(int)Math.sqrt(s.length());
        if(d*d<=s.length()){
            d++;
        }

        for (int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                if(k<s.length()){
                    arr[i][j]=s.charAt(k);
                    k++;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        S1P3_SubstringIn2D ob = new S1P3_SubstringIn2D();
        ob.Rsearch(arr,d,sr,0);
        ob.Csearch(arr,d,sr,0);
    }
}






//import java.util.*;
//public class S1P3_SubstringIn2D {
//    void print(int i,int j,int len,int k)
//    {
//        System.out.println(i+""+j);
//        if(k==0)  //PRINT INDEX OF ROW
//            System.out.println(i+""+(j+len));
//        else       //PRINT INDEX OF COL
//            System.out.println((i+len)+""+j);
//    }
//    void Rsearch(char c[][],int l,String sr,int j)
//    {
//        //row wise search
//        for(int i=0;i<=(l-sr.length());i++)
//        {String s="";
//            for(int k=i;k<i+sr.length();k++){
//                s+=c[j][k];
//            }
//            if(s.equals(sr))
//            {
//                print(j,i,sr.length(),0);
//            }
//        }
//        if(j<l-1)
//        {
//            Rsearch(c,l,sr,++j);
//        }
//    }
//    void Csearch(char c[][],int l,String sr,int j)
//    {
//        //column wise search
//        for(int i=0;i<=(l-sr.length());i++)
//        {    String s="";
//            for(int k=i;k<i+sr.length();k++){
//                s+=c[k][j];
//            }
//            if(s.equals(sr))
//            {
//                print(i,j,sr.length(),1);
//            }
//        }
//        if(j<l-1)
//        {
//            Csearch(c,l,sr,++j);
//        }
//    }
//    public static void main(String args[])
//    {
//        Scanner s=new Scanner(System.in);
//        String k="WELCOMETOZOHOCORPORATION";
//        String sr="TOO";
//        //SET LENGTH OF 2D ARRAY BASED ON LENGTH OF STRING
//        int l=(int)Math.sqrt(k.length());
//        if((l*l)<=k.length())
//        {
//            l++;
//        }
//        int t=0;
//        char c[][]=new char[l][l];
//        //STORE VALUES IN 2D ARRY
//        for(int i=0;i<l;i++)
//        {
//            for(int j=0;j<l;j++)
//            {
//                if(t<k.length())
//                    c[i][j]=k.charAt(t);
//                t++;
//            }
//        }
//        S1P3_SubstringIn2D ob=new S1P3_SubstringIn2D();
//        ob.Rsearch(c,l,sr,0);
//        ob.Csearch(c,l,sr,0);
//    }
//}
