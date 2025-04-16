package service;

import entity.TicketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TicketRepo;

import java.util.List;

@Service
public class TicketService {
    static int i=0;
    @Autowired
    private TicketRepo repo;
    public List<TicketEntity> fall(){

        return repo.findAll();
    }
    public void Tsave(TicketEntity s){
        repo.save(s);
    }
    public int tCount(String name){
        return repo.tCount(name);

    }
    public boolean tBook(String name,int count){
        int n=repo.tBook(name,count);
        if(n>=count){
            repo.tUpdate(name,n-count);
            return true;
        }
        else{
            return false;
        }

    }


}
