/**
 * lab7 package
 */

package KI35.Flyk.lab7;

/**
 * Class Clothes
 * @version 1.0
 */
public class Clothes extends Thing {
    public static int countCl;
    /**
     * Constructor
     * @param weight Thing weight
     * @param name Thing name
     */

    public Clothes(int weight, String name)
    {
        super(weight, name);
        ++countCl;
    }
}
