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
public class BattanianVolunteer extends Unit{
    public BattanianVolunteer(){
        name = "Battanian Volunteer";
        culture = Culture.BATTANIA;
        type = Type.INFANTRY;
        tier = 1;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Battania/battanianvolunteer.png");
        wage = 1;
    }
}
