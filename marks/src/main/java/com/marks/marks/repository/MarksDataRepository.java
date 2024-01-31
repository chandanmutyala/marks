package com.marks.marks.repository;

import com.marks.marks.model.MarksData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksDataRepository extends JpaRepository<MarksData, Long> {
    // Add any additional query methods if needed
    MarksData findByStudentDataId(Long studentId);
}
