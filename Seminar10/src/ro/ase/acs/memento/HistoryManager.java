package ro.ase.acs.memento;

import java.util.Stack;

public class HistoryManager {
    private Stack<Video> history = new Stack<>();

    public void addToHistory(Video video){
        history.push(video);
    }

    public Video getFromHistory(){
        return history.pop();
    }
}
