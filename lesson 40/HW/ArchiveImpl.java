import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchiveImpl implements Archive {
    private List<Document> documents;

    public ArchiveImpl() {
        this.documents = new ArrayList<>();
    }

    @Override
    public boolean addDocument(Document document) {
        if (document == null) return false;
        return documents.add(document);
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String title, String url, LocalDate documentDate) {
        Document doc = getDocument(folderId, documentId);
        if (doc != null) {
            doc.setTitle(title);
            doc.setUrl(url);
            doc.setDocumentDate(documentDate);
            return true;
        }
        return false;
    }

    @Override
    public Document getDocument(int folderId, int documentId) {
        return documents.stream()
                .filter(d -> d.getFolderId() == folderId && d.getDocumentId() == documentId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Document> getDocumentsInFolder(int folderId) {
        return documents.stream()
                .filter(d -> d.getFolderId() == folderId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Document> getDocumentsByDateRange(LocalDate from, LocalDate to) {
        return documents.stream()
                .filter(d -> (d.getDocumentDate().isEqual(from) || d.getDocumentDate().isAfter(from)) &&
                        (d.getDocumentDate().isEqual(to) || d.getDocumentDate().isBefore(to)))
                .collect(Collectors.toList());
    }
    @Override
    public boolean deleteDocument(int folderId, int documentId) {
        return documents.removeIf(d -> d.getFolderId() == folderId && d.getDocumentId() == documentId);
    }

    @Override
    public Document searchDocument(int folderId, int documentId) {
        return getDocument(folderId, documentId); // Reuse existing getDocument method
    }
    @Override
    public int getDocumentCount() {
        return documents.size();
    }
}
