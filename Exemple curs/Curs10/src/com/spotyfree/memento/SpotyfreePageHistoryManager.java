package com.spotyfree.memento;

import java.util.Stack;

public class SpotyfreePageHistoryManager {
    private Stack<SpotyfreeAppPage> navigationHistory = new Stack<>();

    public void addToHistory(SpotyfreeAppPage page) {
        navigationHistory.push(page);
    }

    public SpotyfreeAppPage getLastPageFromHistory() {
        return navigationHistory.pop();
    }
}
