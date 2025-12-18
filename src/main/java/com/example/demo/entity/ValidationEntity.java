package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class ValidationEntity{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
   @NotNull
   @Size(min=2,max=10,msg="must be 2 to 10 characters")
   private String username;
   @Email
   private String email;
   private String password;
   private int age;

}