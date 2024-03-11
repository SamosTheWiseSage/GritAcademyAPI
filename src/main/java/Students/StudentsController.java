package Students;

import Kurser.Kurser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @GetMapping(value="/students",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllStudents() {
        //return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);
        System.out.println("hehehekjbe,mnbfkjnsbfjkwebfjkw");
        return new ResponseEntity<>("TEST", HttpStatus.OK);
    }

}
