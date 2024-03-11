package Kurser;

import Students.Students;
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


@Entity(name = "kurser")
@Table(name = "kurser")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Kurser {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "namn")
    private String namn;
    @ManyToMany(mappedBy = "kurser")

    private Set<Students> students = new HashSet<>();

}

