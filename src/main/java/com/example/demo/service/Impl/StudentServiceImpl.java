package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    //save()
    //findAll()
    //findById()
    //deleteById()
    //existsById()
       public StudentEntity postData(StudentEntity stu);
}