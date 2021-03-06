package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.User;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.UserRepository;

/**
 * 
 * @autor fabianhr
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public Optional<User> getById(Integer id){
        return userRepository.getById(id);
    }

    public Boolean existeEmail(String email){
        return userRepository.existeEmail(email);
    }

    public User registrar(User user){
        if(user.getId()== null)
            return user;
            Optional<User> existeUser = getById(user.getId());

            if (existeUser.isPresent())
            return user;
        
            return userRepository.save(user);

    }

    public User update (User user){

        if (user.getId() == null)
        return user;

        Optional <User> existeUser = userRepository.getById(user.getId());

        if(existeUser.isPresent() == false)
        return null;;
        
        userRepository.save(user);
        return user;
    }

    public boolean deleteUser(Integer id){
        Boolean aBoolean = getById(id).map(user ->{
            userRepository.delete(user);
            return true;    
        }).orElse(false);
        return aBoolean;
    }
    

    




    
    public User autenticarUsuario(String email, String password){
    User user = userRepository.autenticarUsuario(email, password);
    User validacionFallida = new User();

    if(user == null){
        return validacionFallida;
    }else{
        return user;
    }
}


 
}       
