package com.omeraran.booking.controller;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ClientDto getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }
    @PostMapping()
    public ClientDto saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }
}
