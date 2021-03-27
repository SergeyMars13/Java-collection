package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.FruitVegetableName;

import java.util.Objects;

public class FruitVegetable extends Vegetable {
    private FruitVegetableName fruitVegetableName;

    public FruitVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                          int vegetableCarbohydrates, String vegetableCountryManufacture,
                          VegetableMethodForGrowing vegetableMethodForGrowing,
                          FruitVegetableName fruitVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.fruitVegetableName = fruitVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FruitVegetable that = (FruitVegetable) o;
        return fruitVegetableName == that.fruitVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fruitVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", fruitVegetableName=" + fruitVegetableName +
                        '}');
    }
}
