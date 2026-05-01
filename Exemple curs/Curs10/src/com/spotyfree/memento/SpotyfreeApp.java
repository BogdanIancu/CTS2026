package com.spotyfree.memento;

public class SpotyfreeApp {
    private SpotyfreePageHistoryManager historyManager = new SpotyfreePageHistoryManager();
    private SpotyfreeAppPage currentPage;

    public SpotyfreeApp(SpotyfreeAppPage currentPage) {
        this.currentPage = currentPage;
    }

    public SpotyfreeAppPage getCurrentPage() {
        return currentPage;
    }

    public void navigateTo(SpotyfreeAppPage page) {
        //...
        historyManager.addToHistory(currentPage);
        currentPage = page;
    }

    public void navigateBack() {
        currentPage = historyManager.getLastPageFromHistory();
    }
}
