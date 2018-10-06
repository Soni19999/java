import java.util.*;
 
public class Main
{
    public static void main(String []s)
    {
        int n;
        
        Scanner sc=new Scanner(System.in);
         
        
        n=sc.nextInt();
        
        
        
        if(n>0)
            System.out.println(" POSITIVE ");
        else if(n<0)
            System.out.println(" NEGATIVE ");
        else
            System.out.println(" ZERO");
         
    }
}
