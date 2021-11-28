package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.CrudRepository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.User;


/**
 * 
 * @autor fabianhr
 */
public interface UserCrudRepository extends MongoRepository <User, Integer> {
    
    Optional<User> findByEmail(String email);

    @Query
    public User findByEmailAndPassword (String email, String password);
}
