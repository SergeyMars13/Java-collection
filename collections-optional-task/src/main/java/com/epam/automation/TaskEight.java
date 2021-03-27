package com.epam.automation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import static java.util.Arrays.stream;

public class TaskEight {
    public HashSet<String> listUniqueWordFromFile;

    public TaskEight(HashSet<String> listUniqueWordFromFile) {
        this.listUniqueWordFromFile = listUniqueWordFromFile;
    }

    public HashSet<String> getListUniqueWordFromFile() {
        return listUniqueWordFromFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskEight taskEight = (TaskEight) o;
        return Objects.equals(listUniqueWordFromFile, taskEight.listUniqueWordFromFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listUniqueWordFromFile);
    }

    @Override
    public String toString() {
        return "TaskEight{" +
                "listUniqueWordFromFile=" + listUniqueWordFromFile +
                '}';
    }

    public void getUniqueWordsFromText() {
        String inputFileName = "D:\\collections\\collections-optional-task\\englishText.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> listLinesFromFile = new ArrayList<>();
        bufferedReader
                .lines()
                .forEach(line -> listLinesFromFile.add(line.replaceAll("[^a-zA-Z ]", "").toUpperCase()));
        listLinesFromFile.removeAll(Arrays.asList(null,""));
        HashSet<String> listUniqueWord = new HashSet<>();
        listLinesFromFile
                .forEach(line -> stream(line.split(" ")).forEach(word -> listUniqueWord.add(word)));
        listUniqueWord.removeIf(word -> word.isEmpty());
        System.out.println(listUniqueWord);
    }
}
