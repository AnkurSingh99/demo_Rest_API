package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int Book_id;
    private  String Book_name;
    private  String Author;
    public Book()
    {
        super();
    }
    public Book(@JsonProperty("Book_id") int Book_id,
                @JsonProperty("Book_name") String Book_name,
                @JsonProperty("Author") String Author)
    {
        this.Book_id=Book_id;
        this.Book_name=Book_name;
        this.Author=Author;
    }
    //getter methods
    public int getId()
    {
        return Book_id;
    }
    public String getBook_name()
    {
        return Book_name;
    }
    public String getAuthor()
    {
        return Author;
    }

    //setter method
    public void setBook_id(int book_id) {
        Book_id = book_id;
    }



}
