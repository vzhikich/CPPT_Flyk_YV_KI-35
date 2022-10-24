/**
 * package
 */

package KI35.Flyk.lab5;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Flyk Yevhenii
 * @version 1.0
 */

public class EquationsApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));

            out.print("Enter X: ");
            double X = in.nextDouble();

            try
            {
                try
                {
                    Equations eq = new Equations();
                    if(X==90)
                        throw new MyException();
                    fout.print(eq.calculator(X));
                }
                catch (MyException ex){
                    out.print(ex.toString());
                }
                finally
                {
                    fout.flush();
                    fout.close();
                }


            }
            catch (CalcException ex)
            {
                out.print(ex.getMessage());

            }
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }

    }
}
