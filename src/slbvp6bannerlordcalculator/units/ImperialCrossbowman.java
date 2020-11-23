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
public class ImperialCrossbowman extends Unit{
    public ImperialCrossbowman(){
        name = "Imperial Crossbowman";
        culture = Culture.EMPIRE;
        type = Type.RANGED;
        tier = 4;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Imperial/imperialcrossbowman.png");
        wage = 7;
    }
}
