package com.guilherme.designpatternsspring.service.impl;

import com.guilherme.designpatternsspring.model.Address;
import com.guilherme.designpatternsspring.model.AddressRepository;
import com.guilherme.designpatternsspring.model.Client;
import com.guilherme.designpatternsspring.model.ClientRepository;
import com.guilherme.designpatternsspring.service.ClientService;
import com.guilherme.designpatternsspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl  implements ClientService {

    // TODO Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (!client.isPresent()){
        return null;
        }
        return client.get();
    }

    @Override
    public void insert(Client client) {
        String cep = client.getAddress().getCep();
        Address address =  addressRepository.findById(Long.valueOf(cep)).orElseGet(() -> {
            Address newAddress = viaCepService.consultarCep(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });
        client.setAddress(address);
        clientRepository.save(client);
    }

    @Override
    public void update(Long id, Client client) {

    }

    @Override
    public void delete(Long id) {

    }
}
