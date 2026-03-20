package ro.ase.acs.main;

import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.google.GoogleDocumentFactory;
import ro.ase.acs.factorymethod.microsoft.MicrosoftDocumentFactory;
import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.singletonregistry.SingletonRegistry;
import ro.ase.acs.singletonregistry.SingletonRegistry.Logger;
import ro.ase.acs.singletonregistry.SingletonRegistry.DatabaseConnection;


public class Main {
    public static void main(String[] args) {
        SingletonRegistry singletonRegistry = new SingletonRegistry();
        Logger logger = singletonRegistry.getSingleton(Logger.class.getSimpleName());
        logger.log("Hello World");

        DatabaseConnection databaseConnection = singletonRegistry.getSingleton(DatabaseConnection.class.getSimpleName());
        databaseConnection.connect();

        AbstractDocumentFactory documentFactory = new MicrosoftDocumentFactory();
        Document document = documentFactory.createDocument(DocumentType.TEXT, "new document");
        document.open();

        documentFactory = new GoogleDocumentFactory();
        document = documentFactory.createDocument(DocumentType.PRESENTATION, "new presentation");
        document.open();
    }
}
