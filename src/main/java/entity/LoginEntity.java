package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginEntity {
    @Id
    //@GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String email;
}
