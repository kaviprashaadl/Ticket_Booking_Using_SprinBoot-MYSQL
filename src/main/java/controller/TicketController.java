package controller;

import entity.TicketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TicketService;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService service;
    @GetMapping
    public List<TicketEntity> Tickets(){
        return service.fall();
    }
    @PostMapping("/admin")
    public String TicketsReg(@RequestBody TicketEntity en){
            service.Tsave(en);
            return "added Successfully";

    }
    @PostMapping("/count")
    public int Tcount(@RequestParam String Movie ){
        return service.tCount(Movie);
    }
    @PostMapping("/book")
    public String Tbook(@RequestParam String Movie ,@RequestParam int count ){
         if(service.tBook(Movie,count)){
             return("Booked Successfully");
         }
         else{
             return("Booking unsuccessful");
         }
    }

}
