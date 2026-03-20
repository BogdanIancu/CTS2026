package ro.ase.acs.factorymethod.microsoft;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document createDocument(DocumentType documentType, String title) {
        return switch (documentType) {
            case TEXT -> new WordDocument(title);
            case SPREADSHEET -> new ExcelDocument(title);
            case PRESENTATION -> new PowerPointDocument(title);
            default -> throw new IllegalArgumentException("Invalid DocumentType");
        };
    }
}
