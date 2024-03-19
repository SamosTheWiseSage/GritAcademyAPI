package com.GritAcademyAPI.Students;

import com.GritAcademyAPI.Courses.Courses;
import com.GritAcademyAPI.Courses.CoursesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<StudentsDTO> getStudentsByfNames(String fName)
    {
         List<Students> students = studentsRepository.findByfName(fName);
        return students.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public List<StudentsDTO> getStudentlNames(String lName){
        List<Students> students = studentsRepository.findBylName(lName);
        return students.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public List<StudentsDTO> getStudentTowns(String Town){
        List<Students> students = studentsRepository.findByTown(Town);
        return students.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public List<Students> getAllStudents(){
        return studentsRepository.findAll();
    }
    public List<StudentsDTO> getStudentByID(Long id) {
        List<Students> students = studentsRepository.findByid(id);
               return students.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
        public List<StudentsDTO> getAllStudentsWithCourses() {

            List<Students> students = studentsRepository.findAll();

            return students.stream().map(this::mapToDTO).collect(Collectors.toList());

        }
        private StudentsDTO mapToDTO(Students students) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(students.getId());
        dto.setFname(students.getFName());
        dto.setLname(students.getLName());
        dto.setTown(students.getTown());
        dto.setHobby(students.getHobby());
      dto.setCoursesDTOS(students.getCourses().stream().map(this::mapToDTO).collect(Collectors.toList()));
        return dto;
    }

    private CoursesDTO mapToDTO(Courses courses) {

        CoursesDTO dto = new CoursesDTO();

        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());
        return dto;

    }


}

