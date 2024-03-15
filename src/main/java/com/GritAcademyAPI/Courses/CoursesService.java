package com.GritAcademyAPI.Courses;

import com.GritAcademyAPI.Students.Students;
import com.GritAcademyAPI.Students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;
    public List<CoursesDTO> getCoursesIdToStudents(Long coursesid)
    {
        List<Courses> courses = coursesRepository.findCoursesByid(coursesid);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());

    }
    public List<CoursesDTO> getCoursesNameToStudents(String name){
        List<Courses> courses = coursesRepository.findCoursesByName(name);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public List<CoursesDTO> getCoursesbyLetter(String name){
        List<Courses> courses = coursesRepository.findByNameContaining(name);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public List<CoursesDTO> getCoursesbyDesc( String description){
        List<Courses> courses = coursesRepository.findByDescriptionContaining(description);
        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public List<Courses> getAllCourses(){
    return  coursesRepository.findAll();

    }
    public List<CoursesDTO> getAllCoursesWithStudents(){
        List<Courses> courses = coursesRepository.findAll();

        return courses.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    private StudentsDTO mapToDTO(Students students) {

        StudentsDTO dto = new StudentsDTO();

        dto.setId(students.getId());
        dto.setFname(students.getFName());
        dto.setLname(students.getLName());
        dto.setTown(students.getTown());
        dto.setHobby(students.getHobby());
        return dto;

    }private CoursesDTO mapToDTO(Courses courses) {

        CoursesDTO dto = new CoursesDTO();

        dto.setId(courses.getId());
        dto.setName(courses.getName());
        dto.setDescription(courses.getDescription());
       dto.setStudents(courses.getStudents().stream().map(this::mapToDTO).collect(Collectors.toList()));


        return dto;

    }
}
