package ArchiveAppl;

import java.time.LocalDate;
import java.util.Objects;

public class Document {
    private int folderId;
    private int documentId;
    private String title;
    private String url;
    private LocalDate documentDate;

    public Document(int folderId, int documentId, String title, String url, LocalDate documentDate) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.title = title;
        this.url = url;
        this.documentDate = documentDate;
    }

    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    @Override
    public String toString() {
        return "Document{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", documentDate=" + documentDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return folderId == document.folderId &&
                documentId == document.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }
}
