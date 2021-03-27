package com.epam.automation;

import java.util.*;

public class TaskSeven {
    private ArrayDeque<String> listBrackets;

    public TaskSeven(ArrayDeque<String> listBrackets) {
        this.listBrackets = listBrackets;
    }

    public ArrayDeque<String> getListBrackets() {
        return listBrackets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskSeven taskSeven = (TaskSeven) o;
        return Objects.equals(listBrackets, taskSeven.listBrackets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listBrackets);
    }

    @Override
    public String toString() {
        return "TaskSeven{" +
                "listBrackets=" + listBrackets +
                '}';
    }

    public void pushBracketsInArrayDeque() {
        String[] stringArrayList = new String[]{"(", ")", "[", "]", "{", "}"};
        for (int i = 0; i < stringArrayList.length; i++) {
            listBrackets.push(stringArrayList[i]);
        }
    }

    public String checkBracketsArePositionedCorrectly() {
        Deque<String> listBracketForCheck = getListBrackets();
        HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
            put("{", 0);
            put("[", 1);
            put("(", 2);
        }};
        HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
            put("}", 0);
            put("]", 1);
            put(")", 2);
        }};
        String correctPlacement = "Brackets are correctly placed";
        while (!listBracketForCheck.isEmpty()) {
            String lastBracket = listBrackets.pollFirst();
            String penultimateBracket = listBrackets.pollFirst();
            if (lastBracket == null | penultimateBracket == null) {
                correctPlacement = "Brackets are incorrectly placed";
            } else {
                if (openBrackets.get(penultimateBracket) == closeBrackets.get(lastBracket)) {
                   continue;
                } else {
                    correctPlacement = "Brackets are incorrectly placed";
                }
            }
        }
        return correctPlacement;
    }
}
