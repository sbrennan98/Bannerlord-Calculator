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
public class SturgianHunter extends Unit{
    public SturgianHunter(){
        name = "Sturgian Hunter";
        culture = Culture.STURGIA;
        type = Type.RANGED;
        tier = 3;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Sturgia/sturgianhunter.png");
        wage = 4;
    }
}
