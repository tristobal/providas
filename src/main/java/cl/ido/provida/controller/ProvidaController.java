package cl.ido.provida.controller;

import cl.ido.provida.domain.Medic;
import cl.ido.provida.repository.MedicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProvidaController {

    private MedicRepository repository;
    private Logger log = LoggerFactory.getLogger(ProvidaController.class);

    public ProvidaController(MedicRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/medic")
    public List<Medic> getAllMedics() {
        log.info("Listing all medics");
        return repository.findAll();
    }

    @GetMapping("/medic/{name}")
    public List<Medic> getMedicsByName(@PathVariable String name) {
        log.info("Searching medic named {}", name);
        return repository.findByNombreLikeOrderByNombreAsc(name);
    }

}
