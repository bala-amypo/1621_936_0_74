package com.example.demo.entity
import java.sql.Date
@Entity
public class StudentEntity(){

private Integer id;
private String name;
private String email;
private String password;
private Date created;

public Integer getId(){
    return id;
}
public void setId(Integer id){
    this.id=id;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(){
    this.passowrd=password;
}
public String getDate(){
    return date;
}
public void setDate(){
    this.date=date;
}










}