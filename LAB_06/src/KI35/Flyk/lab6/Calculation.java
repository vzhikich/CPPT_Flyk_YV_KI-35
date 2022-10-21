/**
 * package
 */
package KI35.Flyk.lab6;


import java.io.*;
import java.util.*;
/**
 * Class <code>Calculation</code> implements method for (tg(4*x) / x) calculate
 * calculation
 * @author Flyk Yevhenii
 * @version 1.0
 */

public class Calculation {
    private double result, radian;

    /**
     * Method implements write to file
     * @param fName
     * @throws FileNotFoundException
     */
    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }

    /**
     * Method implements read from file
     * @param fName
     */
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method implements write to bin file
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }

    /**
     * Method implements read from bin file
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    /**
     * Method calculates the (tg(4*x) / x) expression
     * @param X Angle in degrees
     * @throws CalcException
     */
    public void calculate(double X) throws CalcException
    {
        radian = Math.toRadians(4*X);

        try {
            result = Math.tan(radian);


            if (result==Double.NaN || result==Double.NEGATIVE_INFINITY || result==Double.POSITIVE_INFINITY || X*4==90 || X*4== -90|| X==0)
                throw new ArithmeticException();
            result = result/X;
        }
        catch(ArithmeticException ex){
            if (radian == Math.PI/2.0 || radian == -Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (X == 0) {
                throw new CalcException("X is equal to 0, it is not possible to divide by 0");
            } else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

    }

    /**
     * Method return result
     * @return (tg(4*x) / x)
     */
    public double getResult()
    {
        return result;
    }

}