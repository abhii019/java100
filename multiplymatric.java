import java.util.Scanner;
public class multiplymatric {
    public static void main(String[] args) {
        int m,n,p,q,sum=0,c,d,k;

    Scanner sc= new Scanner(System.in);
    System.out.println("enetr the elements of row and column of the fiirst matrix"); 

    m= sc.nextInt();
    n= sc.nextInt();

    int first[][] = new int [m][n];
    System.out.println("enter the elements of the first matrix");

    for (c=0;c<m;c++)
    for(d=0;d<n;d++)
    first[c][d]=sc.nextInt();

    System.out.println("enter the no of rows and columns of second matrix");
    p=sc.nextInt();
    q=sc.nextInt();

    if(n!=p)
    System.out.println("matrices with enetred orders cants be multiplied with each other");
    else{
        int second[][]=new int [p][q];
        int multiply[][]= new int[m][q];

        System.out.println("enter the elements of second matrices");
        for (c=0; c<p;c++)
        for (d=0; d<q;d++)
        second[c][d]= sc.nextInt();

        for (c=0;c<m;c++)
        {
            for(d=0;d<q;d++)
            {
                for (k=0;k<p;k++)
                {
                    sum = sum + first[c][k]*second[k][d]; 
                }
                multiply[c][d] = sum;
                sum = 0;
            }
        }
        System.out.println("Product of entered matrices:-");
for ( c = 0 ; c < m ; c++ )
{
for ( d = 0 ; d < q ; d++ )
System.out.print(multiply[c][d]+"\t");
System.out.print("\n");
}


    }
    }
}
