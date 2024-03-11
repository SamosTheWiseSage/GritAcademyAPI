package Kurser;

import Students.StudentsDTO;
import lombok.Data;

import java.util.List;

@Data
public class KurserDTO {
        private Integer id;

        private String name;

        private List<StudentsDTO> students;

    }

