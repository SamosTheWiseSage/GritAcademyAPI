package com.GritAcademyAPI.Students;
import com.GritAcademyAPI.Courses.Courses;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

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
    private Long id;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "town")
    private String town;
    @Column(name = "hobby")
    private String hobby;
    @ManyToMany(fetch = FetchType.LAZY, cascade =
            CascadeType.ALL)

    @JoinTable(

            name = "students_courses",

            joinColumns = @JoinColumn(name = "students_id"),

            inverseJoinColumns = @JoinColumn(name = "courses_id")

    )

    private Set<Courses> courses = new HashSet<>();
}
