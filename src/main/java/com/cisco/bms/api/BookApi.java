package com.cisco.bms.api;

import com.cisco.bms.entity.RequestDTO;
import com.cisco.bms.entity.ResponseDTO;
import com.cisco.bms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/books")
public class BookApi {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseDTO getAllBooks() {
        return  bookService.getAllBooks();
    }


    @PostMapping
    public void saveBook(@RequestBody RequestDTO request) {
        bookService.postBook(request);
    }
}
