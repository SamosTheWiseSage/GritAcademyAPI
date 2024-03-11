package Students;

import Kurser.KurserDTO;
import lombok.Data;

import java.util.List;

@Data
public class StudentsDTO {
        private Integer id;

        private String name;

        private List<KurserDTO> kurser;


}
