package com.springbootcorssupport.springbootcorssupport.contrroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Date: 01/05/2020 - 1:10 pm
 * User: shivam.si
 */
public class ProductController {

    @RequestMapping(value = "/products")
    @CrossOrigin(origins = "http://localhost:9090")
    public ResponseEntity<Object> getProduct() {
        return null;
    }
}
