package ro.ase.acs.memento;

public class VideoEditor {
    private Video video;
    private HistoryManager historyManager;

    public VideoEditor() {
        this.historyManager = new HistoryManager();
        this.video = new Video("Untitled");
        this.video.setLength(0);
    }

    public void edit(int length) {
        video.setLength(video.getLength() + length);
    }

    public void save() {
        try {
            this.historyManager.addToHistory((Video) video.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void undo() {
        this.video = this.historyManager.getFromHistory();
    }

    @Override
    public String toString() {
        return video.getTitle() + " - " + video.getLength() + " s";
    }
}
