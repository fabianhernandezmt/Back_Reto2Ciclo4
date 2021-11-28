package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.CrudRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.Clothe;

/**
 * 
 * @autor fabianhr
 */
public interface ClotheCrudRepository extends  MongoRepository <Clothe, String>{
    
}
