package Kurser;

import Kurser.Kurser;
import Students.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface KurserRepository  extends JpaRepository<Kurser, Integer> {
   List<Students>findStudentsByKursID(Integer kursID);
}
