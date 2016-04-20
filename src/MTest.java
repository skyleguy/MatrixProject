
public class MTest
{
    public static void main(String[]args)
    {
        Matrix m = new Matrix(2, 2);
        System.out.print(m);
        MTools.getDimensions(m.getArr());
    }
}
