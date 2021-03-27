package com.epam.automation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;

public class TaskFourAndFive {
    private ArrayList<String> listLinesFromFile;

    public TaskFourAndFive(ArrayList<String> listLinesFromFile) {
        this.listLinesFromFile = listLinesFromFile;
    }

    public ArrayList<String> getListLinesFromFile() {
        return listLinesFromFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskFourAndFive taskFourAndFive = (TaskFourAndFive) o;
        return Objects.equals(listLinesFromFile, taskFourAndFive.listLinesFromFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listLinesFromFile);
    }

    @Override
    public String toString() {
        return "TaskFourAndFive{" +
                "listLinesFromFile=" + listLinesFromFile +
                '}';
    }

    public ArrayList<String> addLinesFromFileToList() {
        String inputFileName = "D:\\collections\\collections-optional-task\\inputFile.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> listLinesFromFile = getListLinesFromFile();
        bufferedReader.lines().filter(line -> !line.equals("")).forEach(listLinesFromFile::add);
        return listLinesFromFile;
    }

    public void sortListLinesFromFileByLengthLine() {
        getListLinesFromFile().sort((o1, o2) -> o1.length() - o2.length());
    }

    public void sortListLinesFromFileByLengthLineRevers() {
        getListLinesFromFile().sort((o1, o2) -> -(o1.length() - o2.length()));
    }
}
