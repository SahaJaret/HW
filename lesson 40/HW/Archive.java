import java.time.LocalDate;
import java.util.List;

public interface Archive {
    boolean addDocument(Document document);
    boolean updateDocument(int folderId, int documentId, String title, String url, LocalDate documentDate);
    Document getDocument(int folderId, int documentId);
    List<Document> getDocumentsInFolder(int folderId);
    List<Document> getDocumentsByDateRange(LocalDate from, LocalDate to);
    int getDocumentCount();
    boolean deleteDocument(int folderId, int documentId);
    Document searchDocument(int folderId, int documentId);
}
