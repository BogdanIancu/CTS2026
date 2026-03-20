package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;
import ro.ase.acs.factorymethod.contracts.Document;

public class GoogleSheetsDocument extends AbstractDocument {
    GoogleSheetsDocument(String title) {
        this.title = title;
    }

    @Override
    public void open() {
        System.out.println("Opening Google Sheets Document...");
    }
}
