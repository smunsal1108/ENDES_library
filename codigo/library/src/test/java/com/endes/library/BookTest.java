package com.endes.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testBookCreation() {
        Book book = new Book();
        assertNotNull(book);
    }
}
