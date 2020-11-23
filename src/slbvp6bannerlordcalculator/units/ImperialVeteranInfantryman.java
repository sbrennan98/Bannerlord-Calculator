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
public class ImperialVeteranInfantryman extends Unit{
    public ImperialVeteranInfantryman(){
        name = "Imperial Veteran Infantryman";
        culture = Culture.EMPIRE;
        type = Type.INFANTRY;
        tier = 4;
        powerLevel = calculatePowerLevel();
        icon = new Image("/slbvp6bannerlordcalculator/units/icons/Imperial/imperialveteraninfantryman.png");
        wage = 7;
    }
}
