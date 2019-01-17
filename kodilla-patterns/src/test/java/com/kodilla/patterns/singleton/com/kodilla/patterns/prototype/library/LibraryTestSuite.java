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
        Book book1 = new Book("ewa", "farna", LocalDate.now());
        Book book2 = new Book("mario", "bischin", LocalDate.now());

        Library library = new Library("book");
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library libraryDeep = library.deepCopy();
        Library libraryShallow = library.shallowCopy();

        //When
        library.getBooks().remove(book);
        libraryDeep.getBooks().remove(book);

        //Then
        Assert.assertEquals(libraryShallow.getBooks(), library.getBooks());
        Assert.assertEquals(libraryDeep.getBooks(), library.getBooks());

    }
}