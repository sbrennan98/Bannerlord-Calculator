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
public class AseraiMamelukeSoldier extends Unit{
    public AseraiMamelukeSoldier(){
        name = "Aserai Mameluke Soldier";
        culture = Culture.ASERAI;
        type = Type.INFANTRY;
        tier = 2;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Aserai/aseraimamelukesoldier.png");
        wage = 2;
    }
}
