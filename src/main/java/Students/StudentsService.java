package Students;

import Kurser.Kurser;
import Kurser.KurserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;
    public List<Kurser> getKurserForStudents(Integer studentID)
    {

        return
                studentsRepository.findByKurserByStudentsID(studentID);

    }
    public List<Students> getAllStudents(){
        return studentsRepository.findAll();
    }
        public List<StudentsDTO> getAllStudentsWithKurser() {

            List<Students> students = studentsRepository.findAll();

            return students.stream()

                    .map(this::mapToDTO)

                    .collect(Collectors.toList());

        }private StudentsDTO mapToDTO(Students students) {

        StudentsDTO dto = new StudentsDTO();

        dto.setId(students.getId());

        dto.setName(students.getFname());

        dto.setKurser(students.getKurser().stream()

                .map(this::mapToDTO)

                .collect(Collectors.toList()));

        return dto;

    }

    private KurserDTO mapToDTO(Kurser kurser) {

        KurserDTO dto = new KurserDTO();

        dto.setId(kurser.getId());

        dto.setName(kurser.getNamn());

        return dto;

    }

}

