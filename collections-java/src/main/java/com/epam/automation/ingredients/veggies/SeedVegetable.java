package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.SeedVegetableName;

import java.util.Objects;

public class SeedVegetable extends Vegetable {
    private SeedVegetableName seedVegetableName;

    public SeedVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                         int vegetableCarbohydrates, String vegetableCountryManufacture, VegetableMethodForGrowing vegetableMethodForGrowing, SeedVegetableName seedVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates, vegetableCountryManufacture, vegetableMethodForGrowing);
        this.seedVegetableName = seedVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SeedVegetable that = (SeedVegetable) o;
        return seedVegetableName == that.seedVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seedVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", seedVegetableName=" + seedVegetableName +
                        '}');
    }
}
