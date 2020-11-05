package cl.ido.provida.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "medicos")
@AllArgsConstructor
@NoArgsConstructor
public class Medic {
    private String nombre;
    private String institucion;
    private String region;
}
