package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.TuberVegetableName;

import java.util.Objects;

public class TuberVegetable extends Vegetable {
    private TuberVegetableName tuberVegetableName;

    public TuberVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                          int vegetableCarbohydrates, String vegetableCountryManufacture,
                          VegetableMethodForGrowing vegetableMethodForGrowing,
                          TuberVegetableName tuberVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates,
                vegetableCountryManufacture, vegetableMethodForGrowing);
        this.tuberVegetableName = tuberVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TuberVegetable that = (TuberVegetable) o;
        return tuberVegetableName == that.tuberVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tuberVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", tuberVegetableName=" + tuberVegetableName +
                        '}');
    }
}
