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
public class BattanianHorseman extends Unit{
    public BattanianHorseman(){
        name = "Battanian Horseman";
        culture = Culture.BATTANIA;
        type = Type.CAVALRY;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Battania/battanianhorseman.png");
        wage = 12;
    }
}
