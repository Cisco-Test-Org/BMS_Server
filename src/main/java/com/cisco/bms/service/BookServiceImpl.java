package com.cisco.bms.service;

import com.cisco.bms.entity.Book;
import com.cisco.bms.entity.RequestDTO;
import com.cisco.bms.entity.ResponseDTO;
import com.cisco.bms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void postBook(RequestDTO request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setPages(request.getPages());
        bookRepository.save(book);
    }

    @Override
    public ResponseDTO getAllBooks() {
        List<Book> bookList = bookRepository.findAll();
        ResponseDTO response = new ResponseDTO();
        response.setBookList(bookList);
        return response;
    }
}
