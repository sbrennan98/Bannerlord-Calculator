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
public class SturgianArcher extends Unit{
    public SturgianArcher(){
        name = "Sturgian Archer";
        culture = Culture.STURGIA;
        type = Type.RANGED;
        tier = 4;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Sturgia/sturgianarcher.png");
        wage = 7;
    }
}
