package com.epam.automation;

import com.epam.automation.ingredients.veggies.*;

import java.io.FileInputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static com.epam.automation.classifications.VegetableMethodForGrowing.*;
import static com.epam.automation.vegetablesnames.FlowerVegetableName.BROCCOLI;
import static com.epam.automation.vegetablesnames.LeavesVegetableName.*;
import static com.epam.automation.vegetablesnames.RootVegetableName.*;
import static com.epam.automation.vegetablesnames.SeedVegetableName.PEA;
import static com.epam.automation.vegetablesnames.SteamVegetableName.CELERY;

public class App
{
    static Logger LOGGER;
    static {
        try (FileInputStream ins = new FileInputStream("d:\\collections\\collections-java\\log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(App.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    static List<Vegetable> listVeg = Arrays.asList(
            new RootVegetable(20, 2, 3, 4, "Belarus", GROUND, CARROT),
            new RootVegetable(13, 1, 2, 2, "Russia", GROUND, RADISH),
            new StemVegetable(36, 5, 3, 1,"Spain", HOTHOUSE, CELERY),
            new LeavesVegetable(22, 3, 1, 2, "Ukraine", GROUND, LETTUCE),
            new FlowerVegetable(14, 3, 8, 2,"Poland", HOTHOUSE, BROCCOLI),
            new LeavesVegetable(27, 4, 3, 5, "Ukraine", GROUND, SORREL),
            new SeedVegetable(19, 1, 13, 4, "Lithuania", HOTHOUSE, PEA)
    );

    public static void main( String[] args )
    {
        Salad salad = new Salad(listVeg);
        LOGGER.log(Level.INFO, "The Number of calories in the salad: "
                + salad.getSumCaloriesVegetablesInSalad());
        LOGGER.log(Level.INFO, "Vegetables in a salad sorted by calories: "
                + salad.sortVegetablesInSaladByNumberCalories().toString());
        LOGGER.log(Level.INFO, "List of salad vegetables with calories between "
                + salad.MINIMUM_CALORIES + " and " + salad.MAXIMUM_CALORIES + ": "
                + salad.getListVegetablesWithNumberCaloriesBetweenMinimunAndMaximumCaloriesConstant().toString());
    }
}
