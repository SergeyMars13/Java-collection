package com.epam.automation;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class TaskOne extends ArrayDeque<String> {
    private ArrayDeque<String> listLinesFromFile;

    public TaskOne(ArrayDeque<String> listLinesFromFile) {
        this.listLinesFromFile = listLinesFromFile;
    }

    public ArrayDeque<String> getListLinesFromFile() {
        return listLinesFromFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskOne strings = (TaskOne) o;
        return Objects.equals(listLinesFromFile, strings.listLinesFromFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listLinesFromFile);
    }

    @Override
    public String toString() {
        return "TaskOne{" +
                "listLinesFromFile=" + listLinesFromFile +
                '}';
    }

    public Deque<String> transferLinesFromFileToList() {
        String inputFileName = "D:\\collections\\collections-optional-task\\inputFile.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Deque<String> listLinesFromFile = getListLinesFromFile();
        bufferedReader.lines().forEach(listLinesFromFile::push);
        return listLinesFromFile;
    }
    
    public void writeReversLineOrderFromListToFile() {
        Deque<String> listLinesFromFile = getListLinesFromFile();
        String outputFileName = "D:\\collections\\collections-optional-task\\outputFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            while (!listLinesFromFile.isEmpty()) {
                writer.write(listLinesFromFile.pop() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
