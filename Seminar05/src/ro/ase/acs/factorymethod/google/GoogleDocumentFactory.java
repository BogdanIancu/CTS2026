package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;

public class GoogleDocumentFactory implements AbstractDocumentFactory {


    @Override
    public Document createDocument(DocumentType documentType, String title) {
        return switch (documentType) {
            case TEXT -> new GoogleDocsDocument(title);
            case SPREADSHEET -> new GoogleSheetsDocument(title);
            case PRESENTATION -> new GoogleSlidesDocument(title);
            default -> throw new IllegalArgumentException("Invalid DocumentType");
        };
    }

}
