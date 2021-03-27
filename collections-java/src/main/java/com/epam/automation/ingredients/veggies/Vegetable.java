package com.epam.automation.ingredients.veggies;

import com.epam.automation.classifications.VegetableMethodForGrowing;

import java.util.Objects;

abstract public class Vegetable {
    private int vegetableNumberCalories;
    private int vegetableProtein;
    private int vegetableFat;
    private int vegetableCarbohydrates;
    private String vegetableCountryManufacture;
    private VegetableMethodForGrowing vegetableMethodForGrowing;

    public Vegetable(int vegetableNumberCalories, int vegetableProtein, int vegetableFat,
                     int vegetableCarbohydrates, String vegetableCountryManufacture,
                     VegetableMethodForGrowing vegetableMethodForGrowing) {
        this.vegetableNumberCalories = vegetableNumberCalories;
        this.vegetableProtein = vegetableProtein;
        this.vegetableFat = vegetableFat;
        this.vegetableCarbohydrates = vegetableCarbohydrates;
        this.vegetableCountryManufacture = vegetableCountryManufacture;
        this.vegetableMethodForGrowing = vegetableMethodForGrowing;
    }

    public int getVegetableNumberCalories() {
        return vegetableNumberCalories;
    }

    public VegetableMethodForGrowing getVegetableMethodForGrowing() {
        return vegetableMethodForGrowing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return vegetableNumberCalories == vegetable.vegetableNumberCalories && vegetableProtein == vegetable.vegetableProtein && vegetableFat == vegetable.vegetableFat && vegetableCarbohydrates == vegetable.vegetableCarbohydrates && Objects.equals(vegetableCountryManufacture, vegetable.vegetableCountryManufacture) && vegetableMethodForGrowing == vegetable.vegetableMethodForGrowing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetableNumberCalories, vegetableProtein, vegetableFat, vegetableCarbohydrates, vegetableCountryManufacture, vegetableMethodForGrowing);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "vegetableNumberCalories=" + vegetableNumberCalories +
                ", vegetableProtein=" + vegetableProtein +
                ", vegetableFat=" + vegetableFat +
                ", vegetableCarbohydrates=" + vegetableCarbohydrates +
                ", vegetableCountryManufacture='" + vegetableCountryManufacture + '\'' +
                ", vegetableMethodForGrowing=" + vegetableMethodForGrowing +
                '}';
    }
}
