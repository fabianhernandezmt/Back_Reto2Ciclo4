package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.Clothe;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.CrudRepository.ClotheCrudRepository;


/**
 * 
 * @autor fabianhr
 */
@Repository
public class ClotheRepository {

    @Autowired
    private ClotheCrudRepository clotheCrudRepository;

    public List<Clothe> getAll(){
        return clotheCrudRepository.findAll();
        
    }

    public Optional <Clothe> getById(String reference){
        return clotheCrudRepository.findById(reference);
    }

    public Clothe save(Clothe clothe){
        return clotheCrudRepository.save(clothe);
    }

    public void delete(Clothe clothe){
        clotheCrudRepository.delete(clothe);

    }

    
}
