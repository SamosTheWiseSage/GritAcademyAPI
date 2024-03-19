package com.GritAcademyAPI.Students;

import com.GritAcademyAPI.Courses.CoursesDTO;
import lombok.Data;

import java.util.List;

@Data
public class StudentsDTO {
        private Long id;
        private String fname;
        private String lname;
        private String town;
        private String hobby;
   private List<CoursesDTO> coursesDTOS;


}
