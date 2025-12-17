package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class StudentController{
@Autowired StudentService ser//here actually StudentServiceImpl should be used ut we use StudentService as we dont want to show the logic to user for security purposes
@PostMapping("/post")
public sendData(){
    return 
}
}