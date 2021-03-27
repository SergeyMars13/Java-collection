package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.SeedVegetableName;
import com.epam.automation.vegetablesnames.SteamVegetableName;

import java.util.Objects;

public class StemVegetable extends Vegetable {
    private SteamVegetableName steamVegetableName;

    public StemVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                         int vegetableCarbohydrates, String vegetableCountryManufacture,
                         VegetableMethodForGrowing vegetableMethodForGrowing,
                         SteamVegetableName steamVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.steamVegetableName = steamVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StemVegetable that = (StemVegetable) o;
        return steamVegetableName == that.steamVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), steamVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", steamVegetableName=" + steamVegetableName +
                        '}');
    }
}
