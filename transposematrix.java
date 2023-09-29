import javax.swing.plaf.synth.SynthPasswordFieldUI;

import java.util.Scanner;
public class transposematrix {
    public static void main(String[] args) {
        int m,n,c,d;
        System.out.println("enetr the no  of rows and columns of the matrix");
        Scanner sc = new Scanner(System.in);
m=sc.nextInt();
n= sc.nextInt();
int matrix [][]=new int[m][n];

System.out.println("entre the elements of matrix");
for (c=0;c<m;c++)
for(d=0;d<n;d++)
matrix[c][d]=sc.nextInt();

int transpose[][]=new int[n][m];

for (c=0;c<m;c++){
    for (d=0;d<m;d++)
    transpose[d][c]=matrix[c][d];
}
System.out.println("transpose of entered matrix");
for (c=0;c<m;c++)
{
    for (d=0;d<m;d++)
    System.out.println(transpose[c][d]+"\t");
    System.out.println("\n");
}
    }
}
