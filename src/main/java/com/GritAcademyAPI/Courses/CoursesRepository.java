package com.GritAcademyAPI.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {
   List<Courses>findCoursesByid(Long coursesid);
   List<Courses>findCoursesByName(String name);
   List<Courses>findByNameContaining(String name);
   List<Courses>findByDescriptionContaining(String description);
}
