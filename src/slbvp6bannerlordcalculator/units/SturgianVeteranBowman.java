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
public class SturgianVeteranBowman extends Unit{
    public SturgianVeteranBowman(){
        name = "Sturgian Veteran Bowman";
        culture = Culture.STURGIA;
        type = Type.RANGED;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Sturgia/sturgianveteranbowman.png");
        wage = 12;
    }
}
