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
public class KhuzaitSpearInfantry extends Unit{
    public KhuzaitSpearInfantry(){
        name = "Khuzait Spear Infantry";
        culture = Culture.KHUZAIT;
        type = Type.INFANTRY;
        tier = 4;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Khuzait/khuzaitspearinfantry.png");
        wage = 7;
    }
}
