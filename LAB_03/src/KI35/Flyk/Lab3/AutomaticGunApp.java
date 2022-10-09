/**
 * lab 3 package
 */
package KI35.Flyk.Lab3;

import static java.lang.System.out;
import java.io.*;
/**
 * Automatic Gun Application class implements main method for AutomaticGun
 class possibilities demonstration
 * @author Flyk Yevhenii
 * @version 1.0
 */
public class AutomaticGunApp {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
       // out.println("Number of calls to the constructor with parameters: " + AutomaticGun.count);
        AutomaticGun rifle = new AutomaticGun();
        AutomaticGun rifle2 =new AutomaticGun();

        AutomaticGun par_rifle = new AutomaticGun(305, (float) 24.4);
        AutomaticGun par_rifle2 = new AutomaticGun(405,(float) 44.4);
        AutomaticGun par_rifle3 = new AutomaticGun(304,(float) 22.1);

        out.println("Number of calls to the constructor with parameters: " + AutomaticGun.count);

        /*rifle.SwitchOnFuse();

        rifle.SingleFiring();

        rifle.ReloadAutomaticGun();
        rifle.SwitchOffFuse();
        rifle.SingleFiring();
        out.println("\n");
        rifle.PrintGun();
        out.println("\n");
        rifle.BurstFiring();
        out.println("\n");
        rifle.PrintGun();

        rifle.SwitchOnFuse();
        out.println("\n");
        rifle.PrintGun();
        rifle.SwitchOffFuse();
        out.println("\n");
        rifle.PrintGun();

        rifle.dispose();*/
    }
}
