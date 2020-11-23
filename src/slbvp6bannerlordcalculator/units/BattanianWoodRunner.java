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
public class BattanianWoodRunner extends Unit{
    public BattanianWoodRunner(){
        name = "Battanian Wood Runner";
        culture = Culture.BATTANIA;
        type = Type.INFANTRY;
        tier = 2;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Battania/battanianwoodrunner.png");
        wage = 2;
    }
}
