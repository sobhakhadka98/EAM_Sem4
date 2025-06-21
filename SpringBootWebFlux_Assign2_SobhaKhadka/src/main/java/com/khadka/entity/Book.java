package com.khadka.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
public class Book {
    private String bookId;     // Updated field for book_id
    private String author;
    private String title;
    private double price;
    private boolean available; // Indicates if the book is available or borrowed

    // Relationship with Publisher (Many-to-One)
    private Publisher publishedBy; // Publisher information
    
    // Relationship with Member (Many-to-One)
    private Member borrowedBy;    // Member information

    // Date fields for borrowing
    private String dueDate;       // Due date for book return
    private String returnDate;    // Return date
    private String issue;         // Issue ID or other relevant detail
}
