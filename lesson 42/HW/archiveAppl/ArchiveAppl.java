package ArchiveAppl;

import java.time.LocalDate;

public class ArchiveAppl {

    public static void main(String[] args) {
        Archive archive = new ArchiveImpl();
        archive.addDocument(new Document(1, 101, "1", "url1", LocalDate.of(2022, 1, 10)));
        archive.addDocument(new Document(1, 102, "2", "url2", LocalDate.of(2022, 1, 15)));
        archive.addDocument(new Document(2, 201, "3", "url3", LocalDate.of(2022, 2, 20)));
        archive.addDocument(new Document(2, 202, "4", "url4", LocalDate.of(2022, 2, 25)));

        boolean isUpdated = archive.updateDocument(1, 102, " 2", "new_url2", LocalDate.of(2022, 1, 20));
        System.out.println(isUpdated);
        System.out.println();

        Document doc = archive.getDocument(1, 101);
        System.out.println(doc);
        System.out.println();

        archive.getDocumentsInFolder(1).forEach(System.out::println);
        System.out.println();

        archive.getDocumentsByDateRange(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1)).forEach(System.out::println);
        System.out.println();

        System.out.println(archive.getDocumentCount());
        System.out.println();

        Document searchedDoc = archive.searchDocument(1, 101);
        if (searchedDoc != null) {
            System.out.println("Document found: " + searchedDoc);
        } else {
            System.out.println("Document not found");
        }
        System.out.println();

        boolean isDeleted = archive.deleteDocument(1, 101);
        System.out.println("Document deleted: " + isDeleted);

    }
}
