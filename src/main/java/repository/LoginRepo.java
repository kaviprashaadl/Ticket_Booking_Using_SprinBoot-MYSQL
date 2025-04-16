package repository;

import entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<LoginEntity,Long> {
    @Query("SELECT COUNT(u) > 0 FROM LoginEntity u WHERE u.name = ?1 AND u.password= ?2")
    boolean existsByEmail(String name ,String password);
    @Query("SELECT COUNT(u) =0 FROM LoginEntity u WHERE u.name = ?1 OR u.email= ?2")
    boolean exists(String name ,String password);

}
