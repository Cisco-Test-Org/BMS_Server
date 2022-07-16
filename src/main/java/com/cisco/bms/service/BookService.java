package com.cisco.bms.service;

import com.cisco.bms.entity.RequestDTO;
import com.cisco.bms.entity.ResponseDTO;


public interface BookService {
    void postBook(RequestDTO request);
    ResponseDTO getAllBooks();
}
