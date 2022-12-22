package Task1;

import java.util.Scanner;

public class task1_b {
    static int fact(int f)
    {
        int count=f-1;
        while (count!=0)
        {
            f*=count;
            count--;
        }
        return f;
    }
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        int n,r,c,p;
        System.out.println("enter value(n): ");
        n=input.nextInt();
        System.out.println("enter value(r): ");
        r=input.nextInt();

        c=fact(n) / (fact(n-r) * fact(r));
        p=fact(n)/fact(n-r);
        System.out.println("nCr= "+c);
        System.out.println("nPr= "+p);
    }
}
