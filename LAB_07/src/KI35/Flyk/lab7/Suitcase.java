/**
 * lab7 package
 */

package KI35.Flyk.lab7;

import java.util.ArrayList;
/**
 * Class Suitcase
 * @version 1.0
 */

public class Suitcase<T extends Thing>  {
    private ArrayList<T> storage = new ArrayList();
    /**
     * Method returns an item by the index
     * @param index Element index
     */
    public T get(int index)
    {
        try{
            return storage.get(index);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method adds an item
     * @param item Item to be added
     */
    public void add(T item)
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method shows storage content
     */
    public void showAll()
    {
        for(int i = 0; i < storage.size(); i++)
        {
            try{
                storage.get(i).printData();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /**
     * Method returns total weight
     */
    public int getTotalWeight()
    {
        int result = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            result += storage.get(i).getWeight();
        }
        return result;
    }
    /**
     * Method returns fruit with max weight
     */
    public T getFruitWithMaxWeight()
    {
        int maxIdx = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }
            if(storage.get(i).getWeight() < storage.get(maxIdx).getWeight())
            {
                maxIdx = i;
            }
        }
        return storage.get(maxIdx);
    }

}
