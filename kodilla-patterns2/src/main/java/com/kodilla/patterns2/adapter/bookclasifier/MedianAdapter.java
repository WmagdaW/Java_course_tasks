package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian (Set<Book>bookSet){
        Map <BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> libraryBooks = new HashMap<>();
     for (Book book: bookSet) {
         com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book newBook = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());
         libraryBooks.put (new BookSignature (book.getSignature()), newBook);
        }
     return medianPublicationYear(libraryBooks);
    }

}
