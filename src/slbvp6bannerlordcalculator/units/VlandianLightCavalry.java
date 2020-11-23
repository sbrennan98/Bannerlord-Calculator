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
public class VlandianLightCavalry extends Unit{
    public VlandianLightCavalry(){
        name = "Vlandian Light Cavalry";
        culture = Culture.VLANDIA;
        type = Type.CAVALRY;
        tier = 4;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Vlandia/vlandianlightcavalry.png");
        wage = 7;
    }
}
