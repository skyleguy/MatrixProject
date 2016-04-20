import java.util.Arrays;

public class MatrixTest 
{
	public static void main(String[] args)
	{
		try
		{
			double[][] emptyMatrix = {};
			double[][] jaggedArray = {{1,2,3},{4,5},{6,7,8,9}};
			double[][] squareMatrix = {{1,2,3},{4,5,6},{7,8,9}};
			double[][] testMatrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			double[][] testMatrix2 = {{1,2},{3,4},{5,6}};
			double[][] testMatrix3 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
			double[][] testMatrix4 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},{16,17,18}};
			double[][] vector1 = {{1},{2},{3}};
			//MTools.printMatrix(MTools.multConstant(testMatrix4, 1.5));
			//MTools.printMatrix(vector1);
			//MTools.printMatrix(MTools.multMatrices(testMatrix4, vector1));
			double[][] randMatrix = MTools.randomMatrix(2, 3);
			double[][] randMatrix2 = MTools.randomMatrix(3, 1);
			MTools.printMatrix(randMatrix);
			MTools.printMatrix(randMatrix2);
			MTools.printMatrix(MTools.multMatrices(randMatrix, randMatrix2));
		} 
		catch(NullPointerException e)
		{
			System.err.println("You attempted to pass a null value into an operation");
		}
		catch(MatrixCompatibilityException e)
		{
			System.err.println("Your matrixes are of incompatible dimensions");
		}
		catch(JaggedArrayException e)
		{
			System.err.println("One of your matrices is jagged");
		}
	}
}
