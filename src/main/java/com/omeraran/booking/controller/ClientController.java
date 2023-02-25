package com.omeraran.booking.controller;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@CrossOrigin
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ClientDto getClient(@PathVariable Long id){
        return clientService.getOneClient(id);
    }

    @GetMapping()
    public List<ClientDto> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping()
    public ClientDto saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping()
    public ClientDto updateClient(@RequestBody Client client){
       return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteOneClient(@PathVariable Long id){
        clientService.deleteOneClient(id);
    }

}
