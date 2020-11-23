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
public class ImperialArcher extends Unit {
    
    public ImperialArcher(){
        name = "Imperial Archer";
        culture = Culture.EMPIRE;
        type = Type.RANGED;
        tier = 2;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Imperial/imperialarcher.png");
        wage = 2;
    }
}
