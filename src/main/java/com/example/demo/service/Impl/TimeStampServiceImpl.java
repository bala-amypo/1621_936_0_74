package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStaervice;
import  com.example.demo.entity.Studententity;
import  com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TimeStampServiceimpl implements TimeStampService{
      @Autowired StudentRepository student;
      //save()
      //findall()
      //findById()
      //deleteById()
      //existsById()
 @Override
 public TimeStamp postdata(TimeStamp stuuu){
    return student.save(stuuu);
 }
 @Override
  public List<TimeStamp>getAllDataa(){
       return student.findAll();
  }
  }