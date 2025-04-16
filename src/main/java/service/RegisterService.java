package service;

import entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LoginRepo;

@Service
public class RegisterService {
    @Autowired
    private LoginRepo repo;
    public int RegisterCheck(LoginEntity login){
        if(repo.exists(login.getName(),login.getEmail())){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void Rsave(LoginEntity login){
        repo.save(login);
    }
}
