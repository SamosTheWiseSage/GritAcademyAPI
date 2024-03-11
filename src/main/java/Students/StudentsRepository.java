package Students;

import Kurser.Kurser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {


        List<Kurser> findByKurserByStudentsID(Integer studentsID);

    }

