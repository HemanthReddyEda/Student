package com.Assignment1.Student.Controller;

import com.Assignment1.Student.Model.Model;
import com.Assignment1.Student.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private Service Service;
    @PostMapping("/addstudent")
    public Model addstudent(Model student){
        return Service.addstudent(student);
    }
    @GetMapping
    public List<Model> getstudent(){
        return Service.getstudent();
    }
    @GetMapping("/{id}")
    public Optional<Model> getstudentbyid(@PathVariable int id){
        return Service.getstudentbyid(id);
    }
    @DeleteMapping("/{id}")
    public String deletebyid(@PathVariable int id){
        return Service.deletebyid(id);
    }
}
