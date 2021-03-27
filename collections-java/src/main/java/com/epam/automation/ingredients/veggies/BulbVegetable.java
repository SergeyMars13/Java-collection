package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.BulbVegetableName;

import java.util.Objects;

public class BulbVegetable extends Vegetable {
    private BulbVegetableName bulbVegetableName;

    public BulbVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                         int vegetableCarbohydrates, String vegetableCountryManufacture,
                         VegetableMethodForGrowing vegetableMethodForGrowing,
                         BulbVegetableName bulbVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.bulbVegetableName = bulbVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BulbVegetable that = (BulbVegetable) o;
        return bulbVegetableName == that.bulbVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bulbVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", bulbVegetableName=" + bulbVegetableName +
                        '}');
    }
}
