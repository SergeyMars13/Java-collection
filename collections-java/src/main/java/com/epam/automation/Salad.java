package com.epam.automation;

import com.epam.automation.ingredients.veggies.Vegetable;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salad {
    private List<? extends Vegetable> listVegetablesInSalad;
    final int MINIMUM_CALORIES = 15;
    final int MAXIMUM_CALORIES = 23;


    public Salad(List<? extends Vegetable> listVegetablesInSalad) {
        this.listVegetablesInSalad = listVegetablesInSalad;
    }

    public List<? extends Vegetable> getListVegetablesInSalad() {
        return listVegetablesInSalad;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "listVegetablesInSalad=" + listVegetablesInSalad +
                '}';
    }

    public Integer getSumCaloriesVegetablesInSalad() {
        return getListVegetablesInSalad()
                .stream()
                .collect(Collectors.summingInt(value -> value.getVegetableNumberCalories()));
    }

    public Salad sortVegetablesInSaladByNumberCalories() {
        getListVegetablesInSalad().sort((Comparator<Vegetable>) (o1, o2) -> o1.getVegetableNumberCalories()
                        - o2.getVegetableNumberCalories());
        return this;
    }

    public List<? extends Vegetable> getListVegetablesWithNumberCaloriesBetweenMinimunAndMaximumCaloriesConstant() {
        return getListVegetablesInSalad()
                .stream()
                .filter(vegetable -> vegetable.getVegetableNumberCalories() >= MINIMUM_CALORIES
                        & vegetable.getVegetableNumberCalories() <= MAXIMUM_CALORIES)
                .collect(Collectors.toList());
    }
}
