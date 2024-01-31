package com.marks.marks.repository;
import com.marks.marks.model.StudentData;


import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDataRepository extends JpaRepository<StudentData, Long> {

}
