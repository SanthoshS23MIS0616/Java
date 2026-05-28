/*
Question:
How can you create a Java program to Create a 3x3 matrix, print it in formatted form, compute diagonal sums, and transpose it?
*/
import java.util.Scanner;
class Matrix2D{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r;
        int c;
        
        System.out.println("Enter the num of rows:");
        r = sc.nextInt();
        System.out.println("enter the num of columns:");
        c = sc.nextInt();
        int A[][] = new int [r][c];
        System.out.println("enter the values:");
        for(int i = 0; i<r ; i++)
        {
            for(int j = 0; j <c; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
         for(int i = 0; i<r ; i++)
        {
            for(int j = 0; j <c; j++)
            {
                
                System.out.print(A[i][j] +" ");
            }
            System.out.println(" ");
        }
        int diag =0;
        for(int i =0; i<r; i++)
        {
            diag += A[i][i];
        }
        System.out.println(diag);

        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
            System.out.print(A[j][i]+" ");
        }
    
        System.out.println(" ");
    }
    sc.close();
        

    }
}