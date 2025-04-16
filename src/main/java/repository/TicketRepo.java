package repository;

import entity.TicketEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<TicketEntity,Long> {
    @Query("SELECT u.tCount FROM TicketEntity u WHERE u.tName=?1")
    int tCount(String Movie);
    @Query("SELECT u.tCount   FROM TicketEntity u WHERE u.tName=?1 ")
    int tBook(String Movie,int count);
    @Modifying
    @Transactional
    @Query("UPDATE TicketEntity u SET u.tCount=?2 WHERE u.tName=?1")
    void tUpdate(String name,int count);

}
