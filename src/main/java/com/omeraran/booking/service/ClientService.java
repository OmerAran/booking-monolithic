package com.omeraran.booking.service;

import com.omeraran.booking.dto.ClientDto;
import com.omeraran.booking.dto.converter.ClientDtoConverter;
import com.omeraran.booking.model.Client;
import com.omeraran.booking.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientDtoConverter clientDtoConverter;

    public ClientService(ClientRepository clientRepository, ClientDtoConverter clientDtoConverter) {
        this.clientRepository = clientRepository;
        this.clientDtoConverter = clientDtoConverter;
    }

    public ClientDto getOneClient(Long clientId){
        Client client = clientRepository.findById(clientId).orElseThrow(()-> new RuntimeException("message will be added"));
        ClientDto clientDto = clientDtoConverter.convert(client);
        return clientDto;
    }

    public List<ClientDto> getAllClients(){
        List<Client> clients = clientRepository.findAll();
        List<ClientDto> clientDtos = clients.stream()
                .map(clientDtoConverter::convert).collect(Collectors.toList());
        return clientDtos;
    }

    public ClientDto saveClient(Client client) {
        Client savedClient = clientRepository.save(client);
            return clientDtoConverter.convert(savedClient);
    }

    public ClientDto updateClient(Client updateClient) {
        Client client = clientRepository.findById(updateClient.getId()).orElseThrow(()-> new RuntimeException());
        client.setUsername(updateClient.getUsername());
        client.setFirstName(updateClient.getFirstName());
        client.setLastName(updateClient.getLastName());
        client.setDateOfBirth(updateClient.getDateOfBirth());
        client.setPassword(updateClient.getPassword());
        Client savedClient = clientRepository.save(client);
        return clientDtoConverter.convert(savedClient);
    }

    public void deleteOneClient(Long id){
        clientRepository.deleteById(id);
    }


}
