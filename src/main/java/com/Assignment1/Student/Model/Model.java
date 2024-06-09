package com.Assignment1.Student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Model  {
    public String name;
    @Id
    public int id;
    public String grade;
    public int age;
}
