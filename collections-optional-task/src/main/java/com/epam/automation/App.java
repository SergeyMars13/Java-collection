package com.epam.automation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public static void main(String[] args) {

//        Task 1 -  Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке
        TaskOne listLinesFromFile = new TaskOne(new ArrayDeque<>());
        listLinesFromFile.transferLinesFromFileToList();
        listLinesFromFile.writeReversLineOrderFromListToFile();
        System.out.println("Task 1 was completed. Please, check the files: inputFile.txt and outputFile.txt");
        System.out.println();

//        Task 2 -  Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int numberToDeque = scanner.nextInt();
        scanner.close();
        TaskTwo taskTwo = new TaskTwo(new ArrayDeque<>());
        taskTwo.addNumberInArrayDeque(numberToDeque);
        System.out.print("Reversed number: ");
        taskTwo.printNumberWithDigitsInReverseOrder();
        System.out.println();
        System.out.println();

//        Task 3 - Создать список из элементов каталога и его подкаталогов
        Path startDirectory = Paths.get("D:\\collections\\collections-optional-task");
        List<Path> listPath = new ArrayList<>();
        try {
            Files.walk(startDirectory).filter(Files::isDirectory).forEach(path -> listPath.add(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("List of catalog and subdirectories:" + "\n" + listPath);
        System.out.println();

//        Task 4 - Занести стихотворение в список. Провести сортировку по возрастанию длин строк
//        Task 5  - Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
        TaskFourAndFive taskFourAndFive = new TaskFourAndFive(new ArrayList<>());
        taskFourAndFive.addLinesFromFileToList();
        taskFourAndFive.sortListLinesFromFileByLengthLine();
        System.out.println("List of lines sorted in ascending order of length: " + "\n" + taskFourAndFive);
        taskFourAndFive.sortListLinesFromFileByLengthLineRevers();
        System.out.println("List of lines sorted in descending order of length: " + "\n" + taskFourAndFive);
        System.out.println();

//        Task 6 - Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
        TaskSix taskSix = new TaskSix(new ArrayList<>());
        taskSix.takeLinesFromFileWriteToList();
        taskSix.sortListLinesFromFileByFirstCharacterLine();
        System.out.println("List of lines sorted by the first character: " + "\n" + taskSix);
        System.out.println();

//        Task 7 - Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
        TaskSeven taskSeven = new TaskSeven(new ArrayDeque<>());
        taskSeven.pushBracketsInArrayDeque();
        System.out.println("Result of checking the correct placement of brackets: " + "\n" + taskSeven.checkBracketsArePositionedCorrectly());
        System.out.println();

//        Task 8 - Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
        TaskEight taskEight = new TaskEight(new HashSet<>());
        System.out.println("List of unique words from the text: ");
        taskEight.getUniqueWordsFromText();
    }
}
