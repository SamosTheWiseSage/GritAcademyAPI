package Students;
import Kurser.Kurser;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Entity(name = "students")
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Fname")
    private String Fname;

    @ManyToMany(fetch = FetchType.LAZY, cascade =
            CascadeType.ALL)

    @JoinTable(

            name = "Associationstabellen",

            joinColumns = @JoinColumn(name = "studentID"),

            inverseJoinColumns = @JoinColumn(name = "kursID")

    )

    private Set<Kurser> kurser = new HashSet<>();
}
