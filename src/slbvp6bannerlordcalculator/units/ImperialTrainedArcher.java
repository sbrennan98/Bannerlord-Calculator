/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slbvp6bannerlordcalculator.units;

import javafx.scene.image.Image;

/**
 *
 * @author brenn
 */
public class ImperialTrainedArcher extends Unit{
    public ImperialTrainedArcher(){
        name = "Imperial Trained Archer";
        culture = Culture.EMPIRE;
        type = Type.RANGED;
        tier = 3;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Imperial/imperialtrainedarcher.png");
        wage = 4;
    }
}
