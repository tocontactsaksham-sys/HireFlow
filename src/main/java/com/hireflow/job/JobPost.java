package com.hireflow.job;
import jakarta.persistence.*;
@Entity
public class JobPost{
 @Id @GeneratedValue
 Long id;
 String title;
 String location;
 Integer salary;
}