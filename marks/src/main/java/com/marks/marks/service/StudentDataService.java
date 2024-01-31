package com.marks.marks.service;

import com.marks.marks.model.MarksData;
import com.marks.marks.repository.MarksDataRepository;
import com.marks.marks.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDataService {


    @Autowired
    private MarksDataRepository marksDataRepository;

    public void show(){
    MarksData marksData=marksDataRepository.findByStudentDataId(1L);
        System.out.println(marksData);
    }
}
