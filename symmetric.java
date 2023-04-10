import java.util.Scanner;
public class SymmetricMatrixProgram
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.of rows:");
int rows = sc.nextInt();
System.out.println("Enter the no.of columns :");
int cols = sc.nextInt();
int matrix[][]=new int [rows][cols];
System.out.println("Enter the elements :");
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
matrix[i][j]=sc.nextInt();
sc.close();
System.out.println("Printing the input matrix :");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
System.out.println(matrix[i][j]+"\t");
System.out.println();
}
//checking the input matrix for symmetric
if(rows!=cols)
	System.out.println("The given matrix is not a square  matrix");
else
{
	boolean Symmetric =true;
	for(int i=0;i<rows;i++)
		for(int j=0;j<cols;j++)
			if(matrix[i][j]!=matrix[j][i])
			{
				Symmetric=false;
				break;
			}
			if(Symmetric)
			{
				System.out.println("The given matrix is Symmetric");
			}
			else
			{
				System.out.println("The given matrix is not Symmetric");
			}
}
}
}
				