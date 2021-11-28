package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.User;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.CrudRepository.UserCrudRepository;

/**
 * 
 * @autor fabianhr
 */

@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return userCrudRepository.findAll();
    }

    public Optional <User> getById(Integer id){
        return userCrudRepository.findById(id);
    }

    public Boolean existeEmail(String email){
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        return !usuario.isEmpty();
    }

    public User save(User user){
        return userCrudRepository.save(user);
    }

    public void delete(User user){
        userCrudRepository.delete(user);

    }

        

    public User autenticarUsuario(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }


}
