package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);

        when(libraryDatabase.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);

        when(libraryDatabase.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());

    }

    @Test
    public void testListBooksWithHandsOf0() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOf0Books = generateListOfNBooks(0);

        LibraryUser user = new LibraryUser("Edward", "acki", "1111");

        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListOf0Books);

        //When
        List<Book> resultListBookUser = libraryDatabase.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(0, resultListBookUser.size());


    }

    @Test
    public void testListBooksWithHandsOf1() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOf1Books = generateListOfNBooks(1);

        LibraryUser user = new LibraryUser("Edward", "acki", "1111");

        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListOf1Books);

        //When
        List<Book> resultListBookUser = libraryDatabase.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(1, resultListBookUser.size());


    }

    @Test
    public void testListBooksWithHandsOf5() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOf5Books = generateListOfNBooks(5);

        LibraryUser user = new LibraryUser("Edward", "acki", "1111");

        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListOf5Books);

        //When
        List<Book> resultListBookUser = libraryDatabase.listBooksInHandsOf(user);

        //Then
        Assert.assertEquals(5, resultListBookUser.size());


    }

}
