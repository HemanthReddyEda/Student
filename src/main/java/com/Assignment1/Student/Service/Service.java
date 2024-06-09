package com.Assignment1.Student.Service;

import com.Assignment1.Student.Model.Model;
import com.Assignment1.Student.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repo;
    public Model addstudent(Model student) {
        return repo.save(student);
    }

    public List<Model> getstudent() {
        return repo.findAll();
    }

    public Optional<Model> getstudentbyid(int id) {
        return repo.findById(id);
    }

    public String deletebyid(int id) {
        repo.deleteById(id);
        return "Student is deleted";
    }
}
