package com.GritAcademyAPI.Courses;

import com.GritAcademyAPI.Students.StudentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    CoursesService coursesService;
    @GetMapping(value = "/courses", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getAllCourses() {
        //return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);
        System.out.println("hehehekjbe,mnbfkjnsbfjkwebfjkw");
        return new ResponseEntity<>(coursesService.getAllCoursesWithStudents(), HttpStatus.OK);
    }
        @GetMapping(value = "/courses/{id}/students", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<List<CoursesDTO>> getStudentsToCourses( //CHANGE TO DTO
                        @PathVariable(value = "id") Long id)
        {List<CoursesDTO>courses = coursesService.getCoursesIdToStudents(id);
            if (courses.isEmpty()){
                return new ResponseEntity<>(courses,HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(courses,HttpStatus.OK);
        }
    @GetMapping(value = "/courses/name/{name}/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesbyNames(
            @PathVariable(value = "name") String name)
    {List<CoursesDTO>courses = coursesService.getCoursesNameToStudents(name);
        if (courses.isEmpty()){
            return new ResponseEntity<>(courses,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }
    @GetMapping(value = "/courses/lettername/{name}/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesbyLetter(
            @PathVariable(value = "name") String name)
    {List<CoursesDTO> courses = coursesService.getCoursesbyLetter(name);
        if (courses.isEmpty()){
            return new ResponseEntity<>(courses,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }
    @GetMapping(value = "/courses/desc/{description}/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesbyDesc(
            @PathVariable(value = "description") String description)
    {List<CoursesDTO>courses = coursesService.getCoursesbyDesc(description);
        if (courses.isEmpty()){
            return new ResponseEntity<>(courses,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }



}
