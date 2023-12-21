package ArchiveAppl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    private Archive archive;
    private Document testDocument1;
    private Document testDocument2;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl();
        testDocument1 = new Document(1, 101, "1", "url1", LocalDate.of(2022, 1, 10));
        testDocument2 = new Document(1, 102, "2", "url2", LocalDate.of(2022, 1, 15));
        archive.addDocument(testDocument1);
        archive.addDocument(testDocument2);
    }

    @Test
    void addDocument() {
        Document newDocument = new Document(2, 201, "3", "url3", LocalDate.of(2022, 2, 20));
        assertTrue(archive.addDocument(newDocument));
        assertEquals(3, archive.getDocumentCount());
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1, 101, "1", "new_url1", LocalDate.of(2022, 1, 20)));
        Document updatedDoc = archive.getDocument(1, 101);
        assertEquals("1", updatedDoc.getTitle());
        assertEquals("new_url1", updatedDoc.getUrl());
        assertEquals(LocalDate.of(2022, 1, 20), updatedDoc.getDocumentDate());
    }

    @Test
    void getDocument() {
        Document retrievedDoc = archive.getDocument(1, 101);
        assertNotNull(retrievedDoc);
        assertEquals(testDocument1, retrievedDoc);
    }

    @Test
    void getDocumentsInFolder() {
        assertEquals(2, archive.getDocumentsInFolder(1).size());
    }

    @Test
    void getDocumentsByDateRange() {
        LocalDate from = LocalDate.of(2022, 1, 1);
        LocalDate to = LocalDate.of(2022, 1, 30);
        assertEquals(2, archive.getDocumentsByDateRange(from, to).size());
    }

    @Test
    void getDocumentCount() {
        assertEquals(2, archive.getDocumentCount());
    }
}
