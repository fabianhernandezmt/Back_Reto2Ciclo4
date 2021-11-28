package Backend_Reto2_Ciclo4.Backend_Reto2_Ciclo4.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.mongodb.lang.NonNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @autor fabianhr
 */
@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {


    @Id
    private Integer id;
    @NonNull
    private String identification;
    @NonNull
    private String name;
    @NonNull
    private String address;
    @NonNull
    private String cellPhone;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private String zone;
    @NonNull
    private String type;
    
}
