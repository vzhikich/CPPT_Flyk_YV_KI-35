/**
 * lab 4 package
 */

package KI35.Flyk.Lab4;

import java.io.*;
import java.io.FileNotFoundException;

/**
 * Interface which is implemented in the class
 */
interface ScoreChoice{
    void scoreChoice(ScoreSight _scoreSight);

}

/**
 *
 */
interface ReductionScore{
    void reductionScore ();
}

/**
 * Class <code>RifleGun</code> implements rifle gun
 * @author Flyk Yevhenii
 * @version 1.0
 */
public class RifleGun extends AutomaticGun implements ScoreChoice , ReductionScore {
    //object ScoreSight
    private ScoreSight scoreSight;

    /**
     * Constructor
     */
    public RifleGun() {
        super();
        scoreSight=ScoreSight.x1;
    }

    /**
     * Constructor
     * @param _length length of barrel
     * @param _caliber caliber of barrel
     * @param _scoreSight current scoreSight
     */
    public RifleGun(int _length, float _caliber, ScoreSight _scoreSight)  {
        super(_length, _caliber);
        scoreSight= _scoreSight;
    }

    /**
     * Method which return scoreSight
     * @return scoreSight
     */
    public ScoreSight getScoreSight() {
        return scoreSight;
    }

    /**
     * Method which set scoreSight
     * @param scoreSight current scoreSight
     */
    public void setScoreSight(ScoreSight scoreSight) {
        this.scoreSight = scoreSight;
    }

    /**
     * Method which implements an increase in sight mode
     */
    public void magnification() {
        ScoreSight[] score_arr = ScoreSight.values();
        for (int i = 0; i < 4; ++i) {
            if (scoreSight.ordinal() == 3) {
                scoreSight = score_arr[0];
            } else if (scoreSight.ordinal() == i) {
                scoreSight = score_arr[i + 1];
            }

        }
        System.out.println("Options of sight was increased");
    }

    /**
     * Method which implements sight mode reduction
     */
    public void reductionScore () {
        ScoreSight[] score_arr = ScoreSight.values();
        for (int i = 3; i >= 0; --i) {
            if (scoreSight.ordinal() == i) {
                scoreSight = score_arr[i - 1];
            } else if (scoreSight.ordinal() == 0) {
                scoreSight = score_arr[3];
            }
        }
        System.out.println("Options of sight was reduced");
    }

    /**
     * Method that implements the prototype of the method declared in the interface
     * @param _scoreSight current scoresight
     */
    public void scoreChoice(ScoreSight _scoreSight){
        scoreSight=_scoreSight;
    }


}

