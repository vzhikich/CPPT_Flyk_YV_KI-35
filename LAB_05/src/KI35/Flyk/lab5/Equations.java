/**
 * package
 */

package KI35.Flyk.lab5;
import java.io.*;
/**
 * Class <code>Equations</code> implements method for (tg(4*x) / x) expression
 * calculation
 * @author Flyk Yevhenii
 * @version 1.0
 */
public class Equations {
    /**
     * Method calculates the (tg(4*x) / x) expression
     * @param X Angle in degrees
     * @throws CalcException
     * @return (tg(4*x) / x)
     */
    public double calculator(double X) throws CalcException {
        double y, radian;
        radian = Math.toRadians(4*X);

        try{
            y=Math.tan(radian);

            if(y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || X*4==90 || X*4== -90 || X==0){
                throw new ArithmeticException();
            }

            y=y/X;

        }catch (ArithmeticException ex){
            if(radian == Math.PI/2.0 || radian == -Math.PI/2.0){
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            }else if(X==0){
                throw new CalcException("X is equal to 0, it is not possible to divide by 0");
            }else{
                throw new CalcException("Unknown reason of the exception during exception calculation");
            }

        }
        System.out.println(radian);
        System.out.println( Math.tan(radian)/X);
        return y;
    }





}
