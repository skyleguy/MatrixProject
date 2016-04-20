import java.util.Random;

public class MTools {
    /*
     * I have changed this to the new implementation
     */
	public static int[] getDimensions(double [][] input)
	{
		if(input == null)
		{
			throw new NullPointerException();
		}

		return new int[]{input.length, input[0].length};
	}
	
	/*
	 * Did not change this to new implementation
	 */
	public static boolean isValid(double[][] input)
	{
		if(input == null)
		{
			throw new NullPointerException();
		}

		int row1Length = input[0].length;
		for(int i = 1; i < input.length; i++)
		{
			if(input[1].length != row1Length)
			{
				return false;
			}
		}
		return true;
	}
	
	/*
	 * 
	 */
	public static boolean isSquare(double[][] input)
	{
		if(input == null)
		{
			throw new NullPointerException();
		}

		for(int i = 0; i < input.length; i++)
		{
			if(input[i].length != input.length)
			{
				return false;
			}
		}
		return true;
	}

	public static double[][] addMatrices(double[][] x, double[][] y) throws NullPointerException,
	MatrixCompatibilityException, JaggedArrayException
	{
		if(x == null || y == null)
		{
			throw new NullPointerException();
		}
		else if(!isValid(x) || !isValid(y))
		{
			throw new JaggedArrayException();
		}
		else if(x.length != y.length || x[0].length != y[0].length)
		{
			throw new MatrixCompatibilityException();
		}

		double[][] output = new double[x.length][x[0].length];
		for(int i = 0; i < output.length; i++)
			for(int j = 0; j < output[i].length; j++)
			{
				output[i][j] = x[i][j] + y[i][j];
			}
		return output;
	}

	public static double[][] multMatrices(double[][] x, double[][] y) throws NullPointerException,
	MatrixCompatibilityException, JaggedArrayException
	{
		if(x == null || y == null)
		{
			throw new NullPointerException();
		}
		else if(!isValid(x) || !isValid(y))
		{
			throw new JaggedArrayException();
		}
		else if(x[0].length != y.length)
		{
			throw new MatrixCompatibilityException();
		}

		double[][] output = new double[x.length][y[0].length];
		//x row index
		for(int i = 0; i < output.length; i++)
		{
			for(int j = 0; j < output[i].length; j++)
			{
				int sum = 0;
				for(int k = 0; k < y.length; k++)
				{
					sum += y[k][j] * x[i][k];
				}
				output[i][j] = sum;
			}
		}
		return output;
	}

	public static void printMatrix(double[][] input) throws NullPointerException, JaggedArrayException
	{
		if(input == null)
		{
			throw new NullPointerException();
		}
		else if(!isValid(input))
		{
			throw new JaggedArrayException();
		}

		for(int i = 0; i < input.length; i++)
		{
			String s = (i != 0) ? "\n" : input.length + " x " + input[i].length + "\n\n";
			System.out.print(s);
			for(int j = 0; j < input[i].length; j++)
			{
				System.out.print(input[i][j] + "  ");
			}
		}
		System.out.println("\n");
	}

	private static double sumRow(double[] input){
		double sum = 0;
		for(int i = 0; i < input.length; i++)
		{
			sum += input[i];
		}

		return sum;
	}
	
	public static double[][] multConstant(double[][] input, double constant) throws NullPointerException,
		JaggedArrayException
	{
		if(input == null)
		{
			throw new NullPointerException();
		}
		else if(!isValid(input))
		{
			throw new JaggedArrayException();
		}
		
		double[][] output = input.clone();
		for(int i = 0; i < output.length; i++)
		{
			for(int j = 0; j < output[i].length; j++)
			{
				output[i][j] = input[i][j] * constant;
			}
		}
		return output;
	}
	
	public static double[][] randomMatrix(int row, int col){
		double[][] output = new double[row][col];
		Random rand = new Random();
		
		for(int i = 0; i < output.length; i++)
		{
			for(int j = 0; j < output[i].length; j++)
			{
				output[i][j] = rand.nextInt(10);
			}
		}
		
		return output;
	}
	
	public static double[][] randomMatrix(int row, int col, int max){
		double[][] output = new double[row][col];
		Random rand = new Random();
		
		for(int i = 0; i < output.length; i++)
		{
			for(int j = 0; j < output[i].length; j++)
			{
				output[i][j] = rand.nextInt(max + 1);
			}
		}
		
		return output;
	}
	
	public static double[][] transpose(double[][] input)
	{
		return new double[][]{};
	}
	
	public static double[][] leastSquare()
	{
		return new double[][]{};
	};
}
