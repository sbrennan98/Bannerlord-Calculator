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
public class SturgianVeteranWarrior extends Unit{
    public SturgianVeteranWarrior(){
        name = "Sturgian Veteran Warrior";
        culture = Culture.STURGIA;
        type = Type.INFANTRY;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Sturgia/sturgianveteranwarrior.png");
        wage = 12;
    }
}
