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
public class AseraiRecruit extends Unit{
    public AseraiRecruit(){
        name = "Aserai Recruit";
        culture = Culture.ASERAI;
        type = Type.INFANTRY;
        tier = 1;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Aserai/aserairecruit.png");
        wage = 1;
    }
}
