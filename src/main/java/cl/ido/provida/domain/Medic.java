package cl.ido.provida.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "medics")
@AllArgsConstructor
@NoArgsConstructor
public class Medic {
    private String name;
    private String institution;
    private String region;
}
