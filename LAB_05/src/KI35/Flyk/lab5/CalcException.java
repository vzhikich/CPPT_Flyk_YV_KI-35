/**
 * package
 */


package KI35.Flyk.lab5;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author EOM Stuff
 * @version 1.0
 */




public class CalcException extends ArithmeticException {
    /**
     * Constructor
     */
    public CalcException() {
    }

    /**
     * Constructor with string
     * @param cause
     */
    public CalcException(String cause)
    {
        super(cause);
    }
}