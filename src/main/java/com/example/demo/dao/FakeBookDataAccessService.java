/*package com.example.demo.dao;
import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;


public class FakeBookDataAccessService implements Bookdao {
    private static List<Book> DB=new ArrayList<>();
    @Override
    public int insertBook(Book book)
    {
        DB.add(new Book(book.getId(), book.getBook_name(), book.getAuthor()));
        return 1;

    }
    @Override
    public List<Book> selectAllBook()
    {
        return DB;
    }
}

 */
