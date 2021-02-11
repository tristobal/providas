package cl.ido.provida.repository;

import cl.ido.provida.domain.Medic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicRepository extends MongoRepository<Medic, String> {

    /**
     * Search medics by name (case insensitive)
     * @param name
     * @return
     */
    @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
    List<Medic> findByNombreLikeOrderByNombreAsc(String name);
}
