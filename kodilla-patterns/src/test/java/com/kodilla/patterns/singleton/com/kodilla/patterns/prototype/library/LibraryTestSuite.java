package com.kodilla.patterns.singleton.com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        Book book = new Book("elvis", "gibson", LocalDate.now());
        Library library = new Library("book");
        library.getBooks().add(book);

        Book book1 = book.shallowCopy();
        Library library1 = new Library("book1");
        library.getBooks().add(book1);

        //When
        Assert.assertEquals(true, library.getBooks().containsAll(library1.getBooks()));
    }
}