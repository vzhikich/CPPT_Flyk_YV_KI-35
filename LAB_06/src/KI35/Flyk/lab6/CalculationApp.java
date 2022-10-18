/**
 * package
 */

package KI35.Flyk.lab6;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
        * Class <code>CalculationApp</code> Implements driver for Calculation class
 * @author Flyk Yevhenii
        * @version 1.0
        */
public class CalculationApp {

    public static void main(String[] args) throws IOException {
        boolean IsCatched = true;
        Calculation obj = new Calculation();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        try
        {
            obj.calculate(data);
        }
        catch (CalcException ex)
        {
            IsCatched = false;
            System.out.println(ex.getMessage());
        }

        if(IsCatched) {
            System.out.println("Result is: " + obj.getResult());
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");

            obj.readResBin("BinRes.bin");
            System.out.println("Result is(read from bin): " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is(read from txt): " + obj.getResult());
        }

    }
}
