package com.GritAcademyAPI.Students_Courses;
import com.GritAcademyAPI.Courses.Courses;
import com.GritAcademyAPI.Students.Students;
import jakarta.persistence.*;
import lombok.*;
@Entity(name = "students_courses")
@Table(name = "students_courses")
public class Students_Courses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne

    @JoinColumn(name = "students_id",
            referencedColumnName = "id")

    private Students students;

    @ManyToOne

    @JoinColumn(name = "courses_id",

            referencedColumnName = "id")

    private Courses courses;
}
