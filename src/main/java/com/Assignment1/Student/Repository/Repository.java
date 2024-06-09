package com.Assignment1.Student.Repository;

import com.Assignment1.Student.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Model,Integer> {
}
