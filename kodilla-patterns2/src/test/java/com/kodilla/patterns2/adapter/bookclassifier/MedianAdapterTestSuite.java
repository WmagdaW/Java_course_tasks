package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> newBookSet= new HashSet<>();
        newBookSet.add(new Book("Book1", "Author1", 1990, "111111"));
        newBookSet.add(new Book("Book2", "Author2", 1994, "222222"));
        newBookSet.add(new Book("Book3", "Author3", 1998, "333333"));

        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(newBookSet);
        // Then
        assertEquals(publicationYearMedian, 1994);
    }
}
