package com.cafe.bakeitbro.controller;

import com.cafe.bakeitbro.model.response.ResponseModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalTime.now;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Hello world : "+now();
    }
    @GetMapping("/test")
    public ResponseEntity<ResponseModel<Void>> index1(){
        return ResponseEntity.status(HttpStatus.OK)
                .headers(new HttpHeaders())
                .body(new ResponseModel<>("1000"));
    }
}
