package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model.Clothe;
import Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.repository.ClotheRepository;

/**
 * 
 * @autor fabianhr
 */
@Service
public class ClotheService {

    @Autowired
    private ClotheRepository clotheRepository;

    public List<Clothe> getAll(){
        return clotheRepository.getAll();
    }

    public Optional<Clothe> getById(String reference){
        return clotheRepository.getById(reference);
    }

    public Clothe registrar(Clothe clothe){
        if(clothe.getReference()== null)
            return clothe;
            Optional<Clothe> existeClothe = getById(clothe.getReference());

            if (existeClothe.isPresent())
            return clothe;
        
            return clotheRepository.save(clothe);

    }

    public Clothe update(Clothe clothe) {
        
        if (clothe.getReference() == null)
          return clothe;
      
      Optional<Clothe> existeClothe = clotheRepository.getById(clothe.getReference());
      
      if (existeClothe.isPresent() == false)
          return null;

          clotheRepository.save(clothe);
          return clothe;
      }


    public boolean deleteClothe(String reference){
        Boolean aBoolean = getById(reference).map(clothe ->{
            clotheRepository.delete(clothe);
            return true;    
        }).orElse(false);
        return aBoolean;
    }
    
}
