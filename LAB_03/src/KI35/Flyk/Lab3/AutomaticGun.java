/**
 * lab 3 package
 */

package KI35.Flyk.Lab3;

import java.io.*;
import java.util.SortedMap;

/**
 * Class <code>AutomaticGun</code> implements automatic gun
 * @author Flyk Yevhenii
 * @version 1.0
 */


public class AutomaticGun {
    private Magazine m_magazine;
    private Fuse m_fuse;
    private Barrel m_barrel;


    private PrintWriter fout;
    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public AutomaticGun()throws FileNotFoundException {
        m_magazine =new Magazine();
        m_fuse = new Fuse();
        m_barrel = new Barrel();

        fout = new PrintWriter(new File("Log.txt"));
    }
    /**
     * Constructor
     * @param _length Length of barrel
     * @param _caliber Caliber of barrel
     * @throws FileNotFoundException
     */
    public AutomaticGun(int _length,float _caliber)throws FileNotFoundException{
        m_magazine =new Magazine();
        m_fuse= new Fuse();
        m_barrel =new Barrel(_length,_caliber);

        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method implements reload ofmagazine
     */
    public void ReloadAutomaticGun(){
        m_magazine.load();
        m_magazine.setAmmunition(30);
        fout.println("New state of magazine: " + m_magazine.isInserted());
        fout.println("New numbers of ammunition in magazine: " + m_magazine.getAmmunition());
        System.out.println("RELOAD!!!");
    }
    /**
     * Method implements single firing
     */
    public void SingleFiring(){
        if(m_magazine.getAmmunition()>0 && !m_fuse.isState()){
            m_magazine.reduction();

            fout.println("New numbers of ammunition in magazine: " + m_magazine.getAmmunition());
            System.out.println("SHOOT!!!");
        }else
        {
            System.out.println("Shooting is impossible!");
            if(m_magazine.getAmmunition()==0){
                System.out.println("Reload the AutomaticGun");
            }else
            {
                System.out.println("Turn off the fuse");
            }
        }
    }
    /**
     * Method implements burst firing
     */
    public void BurstFiring(){
        if(m_magazine.getAmmunition()>0 && !m_fuse.isState()){
            for(int i=0;i<3;++i) {
                m_magazine.reduction();

                fout.println("New numbers of ammunition in magazine: " + m_magazine.getAmmunition());
                System.out.println("SHOOT!!!");
            }
        }else
        {
            System.out.println("Shooting is impossible!");
            if(m_magazine.getAmmunition()==0){
                System.out.println("Reload the AutomaticGun");
            }else
            {
                System.out.println("Turn off the fuse");
            }
        }
    }
    /**
     * Method implements switch on fuse
     */
    public void SwitchOnFuse(){
        if(!m_fuse.isState()){
            m_fuse.setState(true);

            fout.println("New state of fuse: " + m_magazine.isInserted());
            System.out.println("Fuse switching!!!");
        }
        else{
            System.out.println("The fuse is already on!");
        }
    }
    /**
     * Method implements switch off fuse
     */
    public void SwitchOffFuse(){

        if(m_fuse.isState()){
            m_fuse.setState(false);

            fout.println("New state of fuse: " + m_magazine.isInserted());
            System.out.println("Fuse switching!!!");
        }
        else{
            System.out.println("The fuse is already off!");
        }
    }

    /**
     * Method implements set information about barrel
     * @param _length Length of barrel
     * @param _caliber Caliber of barrel
     */
    public void SetBarrel(int _length,float _caliber){
        m_barrel.setLength(_length);
        m_barrel.setCaliber(_caliber);

        fout.println("New length of barrel: " + m_barrel.getLength());
        fout.println("New caliber of barrel: " + m_barrel.getCaliber());
    }
    /**
     * Method implements printing information about gun
     */
    public void PrintGun(){
        System.out.println("Amount of ammunition: " + m_magazine.getAmmunition());
        System.out.println("Current state of magazine: "+m_magazine.isInserted());
        System.out.println("Current state of fuze: "+m_fuse.isState());
        System.out.println("Length of barrel: "+m_barrel.getLength());
        System.out.println("Caliber of barrel: "+m_barrel.getCaliber());
    }
    /**
     * Method implements set of magazine
     * @param _ammunition
     * @param _state
     */
    public void SetMagazine(int _ammunition,boolean _state){
        m_magazine.setAmmunition(_ammunition);
        m_magazine.setInserted(_state);

        fout.println("New state of magazine: " + m_magazine.isInserted());
        fout.println("New numbers of ammunition in magazine: " + m_magazine.getAmmunition());


    }
    /**
     * Method implements set of fuse
     * @param _state
     */
    public void SetFuse(boolean _state){
        m_fuse.setState(_state);

        fout.println("New state of fuse: " + m_fuse.isState());
    }


    public void dispose()
    {
        fout.close();
    }
}
/**
 * Class <code>Magazine</code> implements magazine
 * @author Flyk Yevhenii
 * @version 1.0
 */
class Magazine{
    //number of ammunition
    private int ammunition;
    //current state of magazine
    private boolean inserted;

    /**
     * Constructor
     */
    public Magazine() {
        this.ammunition = 30;
        this.inserted =true;
    }
    /**
     *  Method returns ammunition
     * @return Number of ammunition
     */
    public int getAmmunition() {
        return ammunition;
    }
    /**
     * Method returns current state magazine
     * @return Current state magazine
     */
    public boolean isInserted() {
        return inserted;
    }
    /**
     * Method set current state magazine
     * @param inserted New current state magazine
     */
    public void setInserted(boolean inserted) {
        this.inserted = inserted;
    }
    /**
     * Method implements a reduction in ammunition
     */
    public void reduction(){
        --(this.ammunition);
    }
    /**
     * Method implements store removal
     */
    public void unLoad(){
        this.inserted=false;
    }
    /**
     * Method implements magazine insertion
     */
    public void load(){
        this.inserted=true;
    }
    /**
     * Method set current state magazine
     * @param ammunition New current state magazine
     */
    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
}
/**
 * Class <code>Fuse</code> implements fuse
 * @author Flyk Yevhenii
 * @version 1.0
 */
class Fuse {
    //State fuse
    private boolean state;
    /**
     * Constructor
     */
    public Fuse(){
        this.state = false;
    }
    /**
     * Method returns current state
     * @return Returns current state of Fuse
     */
    public boolean isState() {
        return state;
    }
    /**
     * Method set state of fuze
     * @param state Set state of fuze
     */
    public void setState(boolean state) {
        this.state = state;
    }
}
/**
 * Class <code>Barrel</code> implements barrel
 * @author Flyk Yevhenii
 * @version 1.0
 */
class Barrel{
    //length of barrel(mm)
    int length;
    //caliber of barrel
    float caliber;

    /**
     * Constructor
     */
    public Barrel(){
        this.length = 415;//standard in Ukraine
        this.caliber = (float) 5.45;//standard in Ukraine
    }
    /**
     * Constructor with parameters
     */
    public Barrel(int _length , float _caliber ){
        this.length = _length;
        this.caliber = _caliber;
    }
    /**
     * Method length of barrel
     * @return Returns length
     */
    public int getLength() {
        return length;
    }
    /**
     * Method set length of barrel
     * @param length of barrel
     */
    public void setLength(int length) {
        this.length = length;
    }
    /**
     * Method caliber of barrel
     * @return Returns caliber
     */
    public float getCaliber() {
        return caliber;
    }
    /**
     * Method set caliber of barrel
     * @param caliber of barrel
     */
    public void setCaliber(float caliber) {
        this.caliber = caliber;
    }
}