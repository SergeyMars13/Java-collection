package com.epam.automation;

import java.util.*;

public class TaskTwo {
    private ArrayDeque listNumbers;

    public TaskTwo(ArrayDeque listNumbers) {
        this.listNumbers = listNumbers;
    }

    public ArrayDeque getListNumbers() {
        return listNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskTwo taskTwo = (TaskTwo) o;
        return Objects.equals(listNumbers, taskTwo.listNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listNumbers);
    }

    @Override
    public String toString() {
        return "TaskTwo{" +
                "listNumbers=" + listNumbers +
                '}';
    }

    public ArrayDeque<Integer> addNumberInArrayDeque(int scannerNumber) {
        ArrayDeque<Integer> listDigits = getListNumbers();
        int number = scannerNumber;
        while (number > 0) {
            int digit = number % 10;
            listDigits.push(digit);
            number /= 10;
        }
        return listDigits;
    }

    public void printNumberWithDigitsInReverseOrder() {
        ArrayDeque<Integer> listDigits = getListNumbers();
        while (!listDigits.isEmpty()) {
            System.out.print(listDigits.removeLast());
        }
    }
}

