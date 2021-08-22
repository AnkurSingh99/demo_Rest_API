package com.example.demo.API;
import java.util.*;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
    @Autowired
    private final BookService bookService;


    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }

    //ADD new book
    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }
    //GET all books
    @GetMapping("/books")
    public List<Book> getAllBook()
    {
       return bookService.getAllBook();
    }

    //GET book by id
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookById(id);
    }

    //Delete Book Handler
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id)
    {
        bookService.deleteBook(id);
    }

    // Update book handler
    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable("id") int id)
    {
         this.bookService.updateBook(book,id);
         return book;
    }
}
