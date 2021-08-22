package com.example.demo.service;
import java.util.*;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;


   //This method is use for adding book into database
    public Book addBook(Book book)
    {
        Book result= bookRepository.save(book);
        return result;
    }
    // This method is use for retrieving All book details from database
    public List<Book> getAllBook()
    {
        List<Book> list= (List<Book>)this.bookRepository.findAll();
        return list;
    }
    // This method is use for retrieving book by id
    public Book getBookById(int id)
    {
        return  bookRepository.findById(id);

    }
    //This method use for deleting book by id
    public void deleteBook(int id)
    {
       bookRepository.deleteById(id);
    }
    //this method is use for updating book
    public void updateBook(Book book, int id)
    {
        book.setBook_id(id);
        bookRepository.save(book);
    }


}
