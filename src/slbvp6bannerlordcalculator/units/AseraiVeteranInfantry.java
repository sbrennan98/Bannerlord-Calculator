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
public class AseraiVeteranInfantry extends Unit{
    public AseraiVeteranInfantry(){
        name = "Aserai Veteran Infantry";
        culture = Culture.ASERAI;
        type = Type.INFANTRY;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Aserai/aseraiveteraninfantry.png");
        wage = 12;
    }
}
