package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;
import com.epam.automation.vegetablesnames.LeavesVegetableName;

import java.util.Objects;

public class LeavesVegetable extends Vegetable {
    private LeavesVegetableName leavesVegetableName;

    public LeavesVegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                           int vegetableCarbohydrates, String vegetableCountryManufacture,
                           VegetableMethodForGrowing vegetableMethodForGrowing,
                           LeavesVegetableName leavesVegetableName) {
        super(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates, vegetableCountryManufacture, vegetableMethodForGrowing);
        this.leavesVegetableName = leavesVegetableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LeavesVegetable that = (LeavesVegetable) o;
        return leavesVegetableName == that.leavesVegetableName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leavesVegetableName);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", leavesVegetableName=" + leavesVegetableName +
                        '}');
    }
}
