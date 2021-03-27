package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.RootVegetableName;

import java.util.Objects;

public class RootVegetable extends Vegetable {
    private RootVegetableName rootVegetableName;

    public RootVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                         int vegetableCarbohydrates, String vegetableCountryManufacture,
                         VegetableMethodForGrowing vegetableMethodForGrowing,
                         RootVegetableName rootVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.rootVegetableName = rootVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RootVegetable that = (RootVegetable) o;
        return rootVegetableName == that.rootVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rootVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", rootVegetableName=" + rootVegetableName +
                        '}');
    }
}
