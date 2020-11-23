/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slbvp6bannerlordcalculator.units;

import java.io.Serializable;
import javafx.scene.image.Image;

/**
 *
 * @author brenn
 */
public abstract class Unit implements Serializable{
    //Abstract class is appropriate here because all units in the game will share these states & behaviors.
    //All units will have at bare minimum the following fields:
    protected String name;
    protected Culture culture;
    protected Type type;
    protected int tier;
    protected float powerLevel; //calculated by [view reddit post]
    protected Image icon;
    protected int wage;
    
    //No constructors for now
    
    public String getName(){
        return name;
    }
    public float getPowerLevel() {
        return powerLevel;
    }
    public Culture getCulture() {
        return culture;
    }
    public Type getType() {
        return type;
    }
    public int getTier() {
        return tier;
    }
    public Image getIcon(){
        return icon;
    }
    public int getWage(){
        return wage;
    }
    public float calculatePowerLevel(){
        //to be developed
        powerLevel = 0;
        return powerLevel;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
