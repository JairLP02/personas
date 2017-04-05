package com.example.android.personas;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by android on 04/04/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static ArrayList<Persona> getPersonas() {
        return personas;
    }
    public  static void guardar(Persona p){
    personas.add(p);
    }

}
