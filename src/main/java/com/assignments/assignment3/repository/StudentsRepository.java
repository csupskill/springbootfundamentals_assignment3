package com.assignments.assignment3.repository;

import com.assignments.assignment3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
