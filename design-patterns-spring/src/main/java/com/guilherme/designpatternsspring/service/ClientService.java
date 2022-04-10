package com.guilherme.designpatternsspring.service;

import com.guilherme.designpatternsspring.model.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

        Iterable<Client> findAll();

        Client findById(Long id);

        void insert(Client client);

        void update(Long id, Client client);

        void delete(Long id);


}