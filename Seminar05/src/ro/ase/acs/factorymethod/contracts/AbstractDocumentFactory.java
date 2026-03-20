package ro.ase.acs.factorymethod.contracts;

import ro.ase.acs.factorymethod.DocumentType;

public interface AbstractDocumentFactory {
    Document createDocument(DocumentType documentType, String title);
}
