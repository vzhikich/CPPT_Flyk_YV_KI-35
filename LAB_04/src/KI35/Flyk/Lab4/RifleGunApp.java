/**
 * lab 4 package
 */

package KI35.Flyk.Lab4;

import java.io.FileNotFoundException;

/**
 * Rifle Gun Application class implements main method for RifleGun
 class possibilities demonstration
 * @author Flyk Yevhenii
 * @version 1.0
 */
public class RifleGunApp {
    /**
     * @param args args
     */
    public static void main(String[] args){
        RifleGun rifle = new RifleGun();
        rifle.SwitchOffFuse();
        rifle.BurstFiring();
        rifle.ReloadAutomaticGun();
        rifle.SwitchOnFuse();
        rifle.getScoreSight();
        rifle.magnification();

    }
}
