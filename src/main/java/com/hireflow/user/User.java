package com.hireflow.user;
import jakarta.persistence.*;
@Entity
public class User{
 @Id @GeneratedValue
 Long id;
 String email;
 String password;
 @Enumerated(EnumType.STRING)
 Role role;
}