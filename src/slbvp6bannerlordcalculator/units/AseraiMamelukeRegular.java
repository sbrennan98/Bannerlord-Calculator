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
public class AseraiMamelukeRegular extends Unit{
    public AseraiMamelukeRegular(){
        name = "Aserai Mameluke Regular";
        culture = Culture.ASERAI;
        type = Type.CAVALRY;
        tier = 3;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Aserai/aseraimamelukeregular.png");
        wage = 4;
    }
}
