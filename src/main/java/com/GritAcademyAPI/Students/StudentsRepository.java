package com.GritAcademyAPI.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

        List<Students> findByid(Long id);
       // List<Students> findCoursesByid(Long studentsID);
        List<Students>findByfName(String fName);
        List<Students>findBylName(String lName);
    List<Students>findByTown(String town);
    }

