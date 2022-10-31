/**
 * lab7 package
 */

package KI35.Flyk.lab7;
/**
 * Class App
 * @author Flyk Yevhenii
 * @version 1.0
 */

public class App {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Suitcase suitcase = new Suitcase();

        suitcase.add(new Clothes(50,  "Pants"));
        //suitcase.add(new Laptops(500,  "LaptopHP"));
        suitcase.add(new Laptops(550,  "LaptopLenovo"));
        suitcase.add(new Towels(100, "Towel"));
        suitcase.add(new Clothes(100, "T-Shirt"));
        suitcase.add(new Clothes(75,  "Hat"));

        System.out.println(suitcase.get(0).getName());
        System.out.println(suitcase.get(1).getName());
        System.out.println(suitcase.get(2).getName());
        System.out.println(suitcase.get(3).getName());

        System.out.println(suitcase.getFruitWithMaxWeight().getName());
        System.out.println(suitcase.getTotalWeight());
        System.out.println("\nNumber of Clothes: "+Clothes.countCl + "\nNumber of Laptops: "+ Laptops.countLap);
    }




}
