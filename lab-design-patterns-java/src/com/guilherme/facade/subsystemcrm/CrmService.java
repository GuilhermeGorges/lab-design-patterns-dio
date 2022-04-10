package com.guilherme.facade.subsystemcrm;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void saveClient(String name, String cep, String state, String city){
        System.out.println("Client save at CRM system:");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(state);
        System.out.println(city);
    }
}
