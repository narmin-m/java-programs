import java.io.*;
import java.util.*;
class fact
{
    public static void main (String args[])
    {
        int n=Integer.parseInt(args[0]);
        int i=1,fact,f;
        while(i<=n)
        {
            fact=1;
            f=i;
            while(f>0)

{
    fact=fact*f;
    f--;
}
System.out.println("\n Factorial of "+i+"="+fact);
i++;       
 }
    }
}