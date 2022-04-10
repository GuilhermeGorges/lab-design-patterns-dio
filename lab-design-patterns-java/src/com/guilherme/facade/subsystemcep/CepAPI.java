package com.guilherme.facade.subsystemcep;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstance(){
        return instance;
    }

    public String recoverCity(String cep){
        return "Blumenau";
    }

    public String recoverState(String cep){
        return "Santa-Catarina";
    }
}
