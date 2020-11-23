/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slbvp6bannerlordcalculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import slbvp6bannerlordcalculator.units.BannerlordCollection;
import slbvp6bannerlordcalculator.units.Unit;

/**
 *
 * @author brenn
 */
public class Army implements Serializable, BannerlordCollection{
    private ArrayList<Unit> army = new ArrayList(); //array list may not be the best collection for this, but we'll work with it for now. Java is amazing because if doesn't work, we can just change the class & its implementation :)
    private int size;
    private int salary;
    
    @Override
    public void add(Unit unit){
        if(unit == null) return; //If no unit is selected, don't add anything. NetBeans had me use == instead of .equals since if it were null i'd result in a NullPointerException
        army.add(unit);
        updateArmy();
    }
    @Override
    public void reset(){
        army.clear();
    }
    public void printArmy(){
        for(int i = 0; i < army.size(); i++){
            System.out.println("Troop #" + i + ": " + army.get(i).getName());
        }
    }
    public ArrayList<Unit> getArmy(){
        return army;
    }
    public void updateArmy(){
        size = army.size();
        salary = 0; //reset salary
        for(int i = 0; i < size; i++){ //perhaps replace with an iterator in the future?
            salary += army.get(i).getWage();
        }
    }
    public int getSize(){
        return size;
    }
    public int getSalary(){
        return salary;
    }



}
