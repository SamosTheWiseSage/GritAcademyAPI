package Kurser;

import Students.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KurserService {
    @Autowired
    private KurserRepository kurserRepository;
    public List<Students> getStudentsInKurser(Integer kursID)
    {

        return kurserRepository.findStudentsByKursID(kursID);

    }
    public List<Kurser> getAllKurser(){
    return  kurserRepository.findAll();

    }
}
