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
public class KhuzaitMarksman extends Unit{
    public KhuzaitMarksman(){
        name = "Khuzait Marksman";
        culture = Culture.KHUZAIT;
        type = Type.RANGED;
        tier = 5;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Khuzait/khuzaitmarksman.png");
        wage = 12;
    }
}
