package Kurser;

import Students.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KurserController {
    @Autowired
    KurserService kurserService;
    @GetMapping(value = "/kurser", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Kurser>> getAllKurser() {
// Simple Response Entity return body
        System.out.println("jfienfke");
        return new ResponseEntity<>(kurserService.getAllKurser(),
                HttpStatus.OK);
    }
}
