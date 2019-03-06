package bmm;

public class Bmm {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a=11;
        b=22;
        c=3;
        while (c!=0){
           c=a%b;
           if (c==0){
               System.out.println(b);
           }else{
               a=b;
               b=c;
           }
        }


    }
}
