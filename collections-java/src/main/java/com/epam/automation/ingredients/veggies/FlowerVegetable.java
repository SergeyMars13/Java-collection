package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.FlowerVegetableName;

import java.util.Objects;

public class FlowerVegetable extends Vegetable {
    private FlowerVegetableName flowerBulbVegetableName;

    public FlowerVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                           int vegetableCarbohydrates, String vegetableCountryManufacture,
                           VegetableMethodForGrowing vegetableMethodForGrowing,
                           FlowerVegetableName flowerBulbVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.flowerBulbVegetableName = flowerBulbVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlowerVegetable that = (FlowerVegetable) o;
        return flowerBulbVegetableName == that.flowerBulbVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flowerBulbVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", flowerBulbVegetableName=" + flowerBulbVegetableName +
                        '}');
    }
}

