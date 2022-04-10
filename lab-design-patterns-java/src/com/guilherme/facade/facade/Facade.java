package com.guilherme.facade.facade;

import com.guilherme.facade.subsystemcep.CepAPI;
import com.guilherme.facade.subsystemcrm.CrmService;

/***
 * Facade
 * @author Guilherme
 */
public class Facade {

    public void migrateClient (String name, String cep){
        String city = CepAPI.getInstance().recoverCity(cep);
        String state = CepAPI.getInstance().recoverState(cep);

        CrmService.saveClient(name, cep, city, state);
    }
}
