import java.util.*;
public class Array_merge
{

    public void replacer(int m, int n, int x[], int y[])
    {
        int count=0;
        for(int i=0; i<m; i++){
            if(x[i]==0)
            {
                x[i]=y[count];
                count++;

            }
        }
        Arrays.sort(x);
        System.out.println("Your merged output is: ");
        for(int i=0; i<m; i++){
            System.out.print(x[i]+" ");
        }
    }
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of m: ");

        int m=sc.nextInt();
        System.out.println("Enter the size of n: ");
        int n=sc.nextInt();
        int []x=new int[m];
        int []y=new int[n];
        System.out.println("Enter elements in x: ");
        for(int i=0; i<m; i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("Enter elements in y: ");
        for(int i=0; i<n; i++)
        {
            y[i]=sc.nextInt();
        }

        Array_merge am=new Array_merge();
        am.replacer(m,n,x, y);
    }
}