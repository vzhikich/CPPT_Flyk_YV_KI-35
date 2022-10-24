/**
 * lab7 package
 */
package KI35.Flyk.lab7;

/**
 * Class Thing
 * @version 1.0
 */


public abstract class Thing {
    protected int weight;
    protected String name;
    /**
     * Constructor
     * @param weight Thing weight
     * @param name Thing name
     */
    public Thing(int weight, String name)
    {
        this.name = name;
        this.weight = weight;
    }
    /**
     * Methods returns Thing weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Methods returns Thing name
     */
    public String getName() { return name; }
    public void printData()
    {
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
    }
}
