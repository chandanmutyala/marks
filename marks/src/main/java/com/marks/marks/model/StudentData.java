package com.marks.marks.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "StudentDetails")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;



    @Column
    private String section;

    @Column
    private String standard;

    @OneToMany(mappedBy = "studentData", cascade = CascadeType.ALL)
    private List<MarksData> marksData;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
