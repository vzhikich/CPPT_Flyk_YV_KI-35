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
        AutomaticGun rifle = new AutomaticGun();
        rifle.SwitchOnFuse();

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

        rifle.dispose();
    }
}
