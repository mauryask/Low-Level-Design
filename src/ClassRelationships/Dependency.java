package ClassRelationships;

import static java.lang.System.out;

class Document {
    private String docName;
    private String docContent;
    private String docType;

    public Document(String docName, String docContent, String docType) {
        this.docName = docName;
        this.docContent = docContent;
        this.docType = docType;
    }

    public String getDocName() {
        return docName;
    }

    public String getDocContent() {
        return docContent;
    }

    public String getDocType() {
        return docType;
    }
}

class Printer {
    public void print(Document document) {
        out.println("Printing document..\nName: " + document.getDocName() + "\nType: " + document.getDocType() + "\nContent: " + document.getDocContent());
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
 * **/