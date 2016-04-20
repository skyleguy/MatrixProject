
public class Matrix
{
    double arr [][];
    int xDimension;
    int yDimension;
    
    public Matrix(int xDimension, int yDimension)
    {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        arr = new double [xDimension][yDimension];
    }
    
    public void setArr(double [][] a) throws MatrixCompatibilityException
    {
        int [] b = MTools.getDimensions(a);
        if (getXDimension() == b[0] && getYDimension() == b[1])
        {
            arr = a;
        }
        else
        {
            throw new MatrixCompatibilityException();
        }
    }
    
    public int getXDimension()
    {
        return xDimension;
    }
    
    public int getYDimension()
    {
        return yDimension;
    }
    
    public double[][] getArr()
    {
        return arr;
    }
    
    public String toString()
    {
        String format = "";
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                format += Double.toString(arr[i][j]) + " ";
            }
            format+= "\n";
        }
        return format;
    }
}

