package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Edward Acki", "Punisher", 998, "edwardo"));
        books.add(new Book("Michal Zadlo", "Krol Hiphopu", 1721, "hiphop"));
        books.add(new Book("Darek Maciborek", "Kolanko mix", 2010, "maxTv"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(1721, result);
    }
}
