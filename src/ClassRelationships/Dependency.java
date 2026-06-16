package ClassRelationships;

import static java.lang.System.out;

record Document(String docName, String docContent, String docType) {
}

class Printer {
    // No permanent reference storage of Document unlike other relationships
    public void print(Document document) {
        out.println("Printing document..\nName: " + document.docName() + "\nType: " + document.docType() + "\nContent: " + document.docContent());
    }
}

public class Dependency {
    public static void main(String[] args) {
        Document document = new Document("OpSindoor_Classified", "Conducted on May 7th, 2025", ".pdf");
        //Here Printer has dependency of Document to print its content: Hence dependency relationship
        //Can take Car and Oil example where Car has dependency of Oil
        Printer printer = new Printer();
        printer.print(document);
    }
}

/*
 * Type: uses-a
 * Ownership: No ownership
 * Lifecycle: Both objects can live independently
 * It is weakest relationships out of all
 * **/