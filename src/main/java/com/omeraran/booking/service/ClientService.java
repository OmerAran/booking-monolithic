package com.omeraran.booking.service;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.dto.converter.ClientDtoConverter;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientDtoConverter converter;

    public ClientService(ClientRepository clientRepository, ClientDtoConverter converter) {
        this.clientRepository = clientRepository;
        this.converter = converter;
    }

    public ClientDto getClient(Long clientId){
        Client client = clientRepository.findById(clientId).orElseThrow(()-> new RuntimeException("message will be added"));
        ClientDto clientDto = converter.convert(client);
        return clientDto;
    }

    public ClientDto saveClient(Client client) {
        Client savedClient = clientRepository.save(client);
            return converter.convert(savedClient);
    }
}
