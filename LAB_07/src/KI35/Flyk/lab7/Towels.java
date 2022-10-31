/**
 * lab7 package
 */


package KI35.Flyk.lab7;

/**
 * Class Towels
 * @version 1.0
 */

public class Towels extends Thing {
    public static int countTow;
    /**
     * Constructor
     * @param weight Thing weight
     * @param name Thing name
     */
    public Towels(int weight, String name)
    {
        super(weight, name);
        ++countTow;
    }
}