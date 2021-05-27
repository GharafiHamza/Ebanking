package com.bank.ebanking.service;

import com.bank.ebanking.model.Client;
import com.bank.ebanking.repo.ClientRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
