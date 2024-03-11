package Associationstabellen;
import Kurser.Kurser;
import Students.Students;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

public class Associationstabellen {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @ManyToOne

    @JoinColumn(name = "studentID",
            referencedColumnName = "id")

    private Students students;

    @ManyToOne

    @JoinColumn(name = "KursID",

            referencedColumnName = "id")

    private Kurser kurser;
}
