package ro.ase.acs.main;

import ro.ase.acs.memento.VideoEditor;
import ro.ase.acs.observer.YouTubeChannel;
import ro.ase.acs.observer.YouTubeSubscriber;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel("Recorder");
        YouTubeSubscriber subscriber1 = new YouTubeSubscriber();
        YouTubeSubscriber subscriber2 = new YouTubeSubscriber();
        youTubeChannel.subscribe(subscriber1);
        youTubeChannel.subscribe(subscriber2);
        youTubeChannel.uploadVideo("Investigatie jurnalistica");
        youTubeChannel.unsubscribe(subscriber1);
        youTubeChannel.uploadVideo("Investigatie jurnalistica 2");

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.inputMoney(8);
        vendingMachine.buyProduct(5);

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.edit(5);
        videoEditor.save();
        System.out.println(videoEditor);
        videoEditor.edit(10);
        System.out.println(videoEditor);
        videoEditor.undo();
        System.out.println(videoEditor);

        PartMover partMover = new RoboticArm();
        partMover.transport();
    }
}
