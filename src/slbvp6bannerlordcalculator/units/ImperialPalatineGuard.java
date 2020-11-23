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
public class ImperialPalatineGuard extends Unit{
    public ImperialPalatineGuard(){
        name = "Imperial Palatine Guard";
        culture = Culture.EMPIRE;
        type = Type.RANGED;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Imperial/imperialpalatineguard.png");
        wage = 12;
    }
}
