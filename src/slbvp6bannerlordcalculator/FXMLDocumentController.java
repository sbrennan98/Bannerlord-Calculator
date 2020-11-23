/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slbvp6bannerlordcalculator;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import slbvp6bannerlordcalculator.units.AseraiArcher;
import slbvp6bannerlordcalculator.units.AseraiFootman;
import slbvp6bannerlordcalculator.units.AseraiInfantry;
import slbvp6bannerlordcalculator.units.AseraiMamelukeAxeman;
import slbvp6bannerlordcalculator.units.AseraiMamelukeCavalry;
import slbvp6bannerlordcalculator.units.AseraiMamelukeGuard;
import slbvp6bannerlordcalculator.units.AseraiMamelukeHeavyCavalry;
import slbvp6bannerlordcalculator.units.AseraiMamelukePalaceGuard;
import slbvp6bannerlordcalculator.units.AseraiMamelukeRegular;
import slbvp6bannerlordcalculator.units.AseraiMamelukeSoldier;
import slbvp6bannerlordcalculator.units.AseraiMasterArcher;
import slbvp6bannerlordcalculator.units.AseraiRecruit;
import slbvp6bannerlordcalculator.units.AseraiSkirmisher;
import slbvp6bannerlordcalculator.units.AseraiTribesman;
import slbvp6bannerlordcalculator.units.AseraiVeteranInfantry;
import slbvp6bannerlordcalculator.units.BattanianClanWarrior;
import slbvp6bannerlordcalculator.units.BattanianFalxman;
import slbvp6bannerlordcalculator.units.BattanianHorseman;
import slbvp6bannerlordcalculator.units.BattanianMountedSkirmisher;
import slbvp6bannerlordcalculator.units.BattanianPickedWarrior;
import slbvp6bannerlordcalculator.units.BattanianRaider;
import slbvp6bannerlordcalculator.units.BattanianScout;
import slbvp6bannerlordcalculator.units.BattanianSkirmisher;
import slbvp6bannerlordcalculator.units.BattanianTrainedSpearman;
import slbvp6bannerlordcalculator.units.BattanianTrainedWarrior;
import slbvp6bannerlordcalculator.units.BattanianVeteranFalxman;
import slbvp6bannerlordcalculator.units.BattanianVeteranSkirmisher;
import slbvp6bannerlordcalculator.units.BattanianVolunteer;
import slbvp6bannerlordcalculator.units.BattanianWildling;
import slbvp6bannerlordcalculator.units.BattanianWoodRunner;
import slbvp6bannerlordcalculator.units.ImperialArcher;
import slbvp6bannerlordcalculator.units.ImperialBucellarii;
import slbvp6bannerlordcalculator.units.ImperialCrossbowman;
import slbvp6bannerlordcalculator.units.ImperialEliteMenavliaton;
import slbvp6bannerlordcalculator.units.ImperialInfantryman;
import slbvp6bannerlordcalculator.units.ImperialLegionary;
import slbvp6bannerlordcalculator.units.ImperialMenavliaton;
import slbvp6bannerlordcalculator.units.ImperialPalatineGuard;
import slbvp6bannerlordcalculator.units.ImperialRecruit;
import slbvp6bannerlordcalculator.units.ImperialSergeantCrossbowman;
import slbvp6bannerlordcalculator.units.ImperialTrainedArcher;
import slbvp6bannerlordcalculator.units.ImperialTrainedInfantryman;
import slbvp6bannerlordcalculator.units.ImperialVeteranArcher;
import slbvp6bannerlordcalculator.units.ImperialVeteranInfantryman;
import slbvp6bannerlordcalculator.units.KhuzaitArcher;
import slbvp6bannerlordcalculator.units.KhuzaitDarkhan;
import slbvp6bannerlordcalculator.units.KhuzaitFootman;
import slbvp6bannerlordcalculator.units.KhuzaitHeavyHorseArcher;
import slbvp6bannerlordcalculator.units.KhuzaitHeavyLancer;
import slbvp6bannerlordcalculator.units.KhuzaitHorseArcher;
import slbvp6bannerlordcalculator.units.KhuzaitHorseman;
import slbvp6bannerlordcalculator.units.KhuzaitHunter;
import slbvp6bannerlordcalculator.units.KhuzaitLancer;
import slbvp6bannerlordcalculator.units.KhuzaitMarksman;
import slbvp6bannerlordcalculator.units.KhuzaitNomad;
import slbvp6bannerlordcalculator.units.KhuzaitRaider;
import slbvp6bannerlordcalculator.units.KhuzaitSpearInfantry;
import slbvp6bannerlordcalculator.units.KhuzaitSpearman;
import slbvp6bannerlordcalculator.units.KhuzaitTribalWarrior;
import slbvp6bannerlordcalculator.units.SturgianArcher;
import slbvp6bannerlordcalculator.units.SturgianBerserker;
import slbvp6bannerlordcalculator.units.SturgianBrigand;
import slbvp6bannerlordcalculator.units.SturgianHardenedBrigand;
import slbvp6bannerlordcalculator.units.SturgianHorseRaider;
import slbvp6bannerlordcalculator.units.SturgianHunter;
import slbvp6bannerlordcalculator.units.SturgianRecruit;
import slbvp6bannerlordcalculator.units.SturgianShockTroop;
import slbvp6bannerlordcalculator.units.SturgianSoldier;
import slbvp6bannerlordcalculator.units.SturgianUlfhednar;
import slbvp6bannerlordcalculator.units.SturgianVeteranBowman;
import slbvp6bannerlordcalculator.units.SturgianVeteranWarrior;
import slbvp6bannerlordcalculator.units.SturgianWarrior;
import slbvp6bannerlordcalculator.units.SturgianWoodsman;
import slbvp6bannerlordcalculator.units.Unit;
import slbvp6bannerlordcalculator.units.VlandianBillman;
import slbvp6bannerlordcalculator.units.VlandianCrossbowman;
import slbvp6bannerlordcalculator.units.VlandianFootman;
import slbvp6bannerlordcalculator.units.VlandianHardenedCrossbowman;
import slbvp6bannerlordcalculator.units.VlandianInfantry;
import slbvp6bannerlordcalculator.units.VlandianLevyCrossbowman;
import slbvp6bannerlordcalculator.units.VlandianLightCavalry;
import slbvp6bannerlordcalculator.units.VlandianPikeman;
import slbvp6bannerlordcalculator.units.VlandianRecruit;
import slbvp6bannerlordcalculator.units.VlandianSergeant;
import slbvp6bannerlordcalculator.units.VlandianSharpshooter;
import slbvp6bannerlordcalculator.units.VlandianSpearman;
import slbvp6bannerlordcalculator.units.VlandianSwordsman;
import slbvp6bannerlordcalculator.units.VlandianVanguard;
import slbvp6bannerlordcalculator.units.VlandianVoulgier;

/**
 *
 * @author brenn
 */
public class FXMLDocumentController implements Initializable {
    private Image image;
    private ObservableList list = FXCollections.observableArrayList();
    private ObservableList armyList = FXCollections.observableArrayList();
    private Army army;
    private Unit currentUnit;
    
    @FXML
    private MenuItem aboutPage;
    @FXML
    private ImageView testImageView;
    @FXML
    private Text unitNameDisplay;
    @FXML
    private Text unitTypeDisplay;
    @FXML
    private Text unitCultureDisplay;
    @FXML
    private Text unitTierDisplay;
    @FXML
    private Button addToArmyButton;
    @FXML
    private ListView<?> armyListView;
    @FXML
    private Text armySizeField;
    @FXML
    private Text armySalary;
    @FXML
    private Text unitWageDisplay;
    @FXML
    private TextField addToArmyButtonMultiplier;
    @FXML
    private ListView<?> empireListView;
    @FXML
    private ListView<?> vlandiaListView;
    @FXML
    private ListView<?> sturgiaListView;
    @FXML
    private ListView<?> khuzaitListView;
    @FXML
    private ListView<?> battaniaListView;
    @FXML
    private ListView<?> aseraiListView;
    @FXML
    private ListView<?> otherListView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        army = new Army();
    }    
    
    @FXML
    private void handleAboutPage(ActionEvent event) {
        //https://www.codeproject.com/questions/398241/how-to-open-url-in-java
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI link = new URI("https://github.com/sbrennan98/Bannerlord-Calculator/blob/master/README.md");
            desktop.browse(link);
        } catch (URISyntaxException ex) {
            System.out.println("ERROR: URI Syntax Exception Occured!");
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            System.out.println("ERROR: Exception Occured!");
            e.printStackTrace(); //code from https://www.codeproject.com/questions/398241/how-to-open-url-in-java
        }
            
    }
    @FXML
    private void addToArmy(ActionEvent event) {
        int number = 1;
        try{
            number = Integer.parseInt(addToArmyButtonMultiplier.getText());
        }
        catch(Exception e){
            number = 1; //If nothing was entered & field remains ""/null then just assume number = 1
        }

        while(number != 0){
            army.add(currentUnit);
            number--;
        }
        updateArmyList();
    }
    private void updateArmyList(){
        //Refresh list
        armyListView.getItems().clear();
        armyList.clear();
        armyList.addAll(army.getArmy());
        armyListView.getItems().addAll(armyList);
        //Set army stats
        armySizeField.setText(String.valueOf(army.getSize()));
        armySalary.setText(String.valueOf(army.getSalary()));
    }

    @FXML
    private void openArmy(ActionEvent event) throws IOException, ClassNotFoundException {
        String directory = System.getProperty("user.dir");
        String filename = (directory + "/Army.bin");
        if(System.getProperty("os.name").toLowerCase().contains("windows")) {
            filename = filename.replace("\\", "/");
        }
        File file = new File(filename);
        if(file == null) return;
        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream input = new ObjectInputStream(fileIn);
            army = (Army) input.readObject(); //IOException here
            input.close();
            fileIn.close();
            updateArmyList();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: FileNotFoundException");
        }
        catch(IOException e){
            System.out.println("Error: IOException");
        }
        catch(Exception e){
            System.out.println("Error opening file");
        }
    }

    @FXML
    private void saveArmy(ActionEvent event) throws IOException {
        String directory = System.getProperty("user.dir");
        String filename = (directory + "/Army.bin");
        if(System.getProperty("os.name").toLowerCase().contains("windows")) {
            filename = filename.replace("\\", "/");
        }
        System.out.println(filename);
        if(army == null) return;
        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream output = new ObjectOutputStream(fileOut);
            output.writeObject(army); //IOException here        
            output.close();
            fileOut.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: FileNotFoundException");
        }
        catch(IOException e){
            System.out.println("Error: IOException");
        }
        catch(Exception e){
            System.out.println("Error saving file");
        }
    }
    
    
    
    
    
    
    
    
    
    //Tons of copy & pasted code below. Will have to figure out if I can optimize functions with the @FXML tag later
    //I tried optimizing it but broke it on accident. Don't have enough time to fix before due date.
    @FXML
    private void empireAccordionPressed(MouseEvent event) { //perhaps can be optimized in the future to include all imperial unit subclasses in a collection instead of manually added in line.
        empireListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new ImperialRecruit(), new ImperialInfantryman(), new ImperialArcher(), new ImperialTrainedInfantryman(), new ImperialTrainedArcher(), new ImperialVeteranInfantryman(), new ImperialMenavliaton(), new ImperialVeteranArcher(), new ImperialCrossbowman(), new ImperialLegionary(), new ImperialEliteMenavliaton(), new ImperialPalatineGuard(), new ImperialBucellarii(), new ImperialSergeantCrossbowman());
        empireListView.getItems().addAll(list);
    }
    @FXML
    private void vlandiaAccordionPressed(MouseEvent event) {
        vlandiaListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new VlandianBillman(), new VlandianCrossbowman(), new VlandianFootman(), new VlandianHardenedCrossbowman(), new VlandianInfantry(), new VlandianLevyCrossbowman(), new VlandianLightCavalry(), new VlandianPikeman(), new VlandianRecruit(), new VlandianSergeant(), new VlandianSharpshooter(), new VlandianSpearman(), new VlandianSwordsman(), new VlandianVanguard(), new VlandianVoulgier());
        vlandiaListView.getItems().addAll(list);
    }

    @FXML
    private void sturgiaAccordionPressed(MouseEvent event) {
        sturgiaListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new SturgianArcher(), new SturgianBerserker(), new SturgianBrigand(), new SturgianHardenedBrigand(), new SturgianHorseRaider(), new SturgianHunter(), new SturgianRecruit(), new SturgianShockTroop(), new SturgianSoldier(), new SturgianUlfhednar(), new SturgianVeteranBowman(), new SturgianVeteranWarrior(), new SturgianWarrior(), new SturgianWoodsman());
        sturgiaListView.getItems().addAll(list);    
    }

    @FXML
    private void khuzaitAccordionPressed(MouseEvent event) {
        khuzaitListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new KhuzaitArcher(), new KhuzaitDarkhan(), new KhuzaitFootman(), new KhuzaitHeavyHorseArcher(), new KhuzaitHeavyLancer(), new KhuzaitHorseArcher(), new KhuzaitHorseman(), new KhuzaitHunter(), new KhuzaitLancer(), new KhuzaitMarksman(), new KhuzaitNomad(), new KhuzaitRaider(), new KhuzaitSpearInfantry(), new KhuzaitSpearman(), new KhuzaitTribalWarrior());
        khuzaitListView.getItems().addAll(list);    
    }

    @FXML
    private void battaniaAccordionPressed(MouseEvent event) {
        battaniaListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new BattanianClanWarrior(), new BattanianFalxman(), new BattanianHorseman(), new BattanianMountedSkirmisher(), new BattanianPickedWarrior(), new BattanianRaider(), new BattanianScout(), new BattanianSkirmisher(), new BattanianTrainedSpearman(), new BattanianTrainedWarrior(), new BattanianVeteranFalxman(), new BattanianVeteranSkirmisher(), new BattanianVolunteer(), new BattanianWildling(), new BattanianWoodRunner());
        battaniaListView.getItems().addAll(list);
    }

    @FXML
    private void aseraiAccordionPressed(MouseEvent event) {
        aseraiListView.getItems().clear();
        list.removeAll(list);
        list.addAll(new AseraiArcher(), new AseraiFootman(), new AseraiInfantry(), new AseraiMamelukeAxeman(), new AseraiMamelukeCavalry(), new AseraiMamelukeGuard(), new AseraiMamelukeHeavyCavalry(), new AseraiMamelukePalaceGuard(), new AseraiMamelukeRegular(), new AseraiMamelukeSoldier(), new AseraiMasterArcher(), new AseraiRecruit(), new AseraiSkirmisher(), new AseraiTribesman(), new AseraiVeteranInfantry());
        aseraiListView.getItems().addAll(list);    
    }

    @FXML
    private void otherAccordionPressed(MouseEvent event) {
        otherListView.getItems().clear();
        list.removeAll(list);
        //list.addAll(new ImperialRecruit(), new ImperialInfantryman(), new ImperialArcher(), new ImperialTrainedInfantryman(), new ImperialTrainedArcher(), new ImperialVeteranInfantryman(), new ImperialMenavliaton(), new ImperialVeteranArcher(), new ImperialCrossbowman(), new ImperialLegionary(), new ImperialEliteMenavliaton(), new ImperialPalatineGuard(), new ImperialBucellarii(), new ImperialSergeantCrossbowman());
        otherListView.getItems().addAll(list);    
    }

    @FXML
    private void displayEmpire(MouseEvent event) {
        currentUnit = (Unit) empireListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }

    @FXML
    private void displayVlandia(MouseEvent event) {
        currentUnit = (Unit) vlandiaListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));    
    }

    @FXML
    private void displaySturgia(MouseEvent event) {
        currentUnit = (Unit) sturgiaListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }

    @FXML
    private void displayKhuzait(MouseEvent event) {
        currentUnit = (Unit) khuzaitListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }

    @FXML
    private void displayBattania(MouseEvent event) {
        currentUnit = (Unit) battaniaListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }

    @FXML
    private void displayAserai(MouseEvent event) {
        currentUnit = (Unit) aseraiListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }

    @FXML
    private void displayOther(MouseEvent event) {
        currentUnit = (Unit) otherListView.getSelectionModel().getSelectedItem();
        image = currentUnit.getIcon();
        testImageView.setImage(image);
        unitNameDisplay.setText(currentUnit.getName());
        unitTypeDisplay.setText(currentUnit.getType().toString());
        unitCultureDisplay.setText(currentUnit.getCulture().toString());
        unitTierDisplay.setText("Tier: " + String.valueOf(currentUnit.getTier()));
        unitWageDisplay.setText("Wage: " + String.valueOf(currentUnit.getWage()));
    }
    
}
