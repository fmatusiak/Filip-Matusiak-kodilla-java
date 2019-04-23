package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int sum = 0;
        for (Map.Entry<BookSignature, Book> bookEntry : books.entrySet()) {
            sum += bookEntry.getValue().getYearOfPublication();
        }
        return sum / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for (Map.Entry<BookSignature, Book> bookEntry : books.entrySet()) {
            years[n] = bookEntry.getValue().getYearOfPublication();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int) (years.length / 2 + 0.5)];
        }
        return years[years.length / 2];
    }
}
