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
public class SturgianRecruit extends Unit{
    public SturgianRecruit(){
        name = "Sturgian Recruit";
        culture = Culture.STURGIA;
        type = Type.INFANTRY;
        tier = 1;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Sturgia/sturgianrecruit.png");
        wage = 1;
    }
}
