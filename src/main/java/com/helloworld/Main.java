package com.helloworld;

import com.google.gson.Gson;


public class Main {
    public static Persona[] conviertePersona(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Persona[].class);
    }

    public static void main(String[] args) {
        String json = "[" + "{\"nombre\": \"Juan Pedro\", \"edad\": 22}, " +
                "{\"nombre\": \"Pablo\", \"edad\": 2}, " +
                "{\"nombre\": \"Juan\", \"edad\": 22}" + "]";

        //Convertir el json a persona
        Persona[] personas = conviertePersona(json);

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        }


    }
}