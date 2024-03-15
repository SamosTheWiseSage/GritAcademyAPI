package com.GritAcademyAPI.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentsService studentsService;
    @GetMapping(value="/students",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>>  getAllStudents() {
        //return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);
        System.out.println("hehehekjbe,mnbfkjnsbfjkwebfjkw");
        return new ResponseEntity<>(studentsService.getAllStudentsWithCourses(), HttpStatus.OK);
    }
    @GetMapping(value = "/students/fname/{fName}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentsByfNames(
            @PathVariable(value = "fName") String fName)
    {
        return new ResponseEntity<>(studentsService.getStudentsByfNames(fName),HttpStatus.OK);
    }
    @GetMapping(value = "/students/lname/{lName}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentlNames(
            @PathVariable(value = "lName") String lName)
    {
        return new ResponseEntity<>(studentsService.getStudentlNames(lName),HttpStatus.OK);
    }
    @GetMapping(value = "/students/town/{town}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentTowns(
            @PathVariable(value = "town") String town)
    {
        return new ResponseEntity<>(studentsService.getStudentTowns(town),HttpStatus.OK);
    }
    @GetMapping(value = "/students/{id}/courses",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentsDTO>> getStudentsByID(
            @PathVariable(value = "id") Long id)
    {
        return new ResponseEntity<>(studentsService.getStudentByID(id),HttpStatus.OK);
    }
}
