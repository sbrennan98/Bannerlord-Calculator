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
public class KhuzaitNomad extends Unit{
    public KhuzaitNomad(){
        name = "Khuzait Nomad";
        culture = Culture.KHUZAIT;
        type = Type.INFANTRY;
        tier = 1;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Khuzait/khuzaitnomad.png");
        wage = 1;
    }
}
