/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

public class Batalla {
    //Atributos
    private ArrayList<String> personajesVivos;
    private ArrayList<String> personajesMuertos;

    public Batalla(ArrayList<String> personajesVivos, ArrayList<String> personajesMuertos) {
        this.personajesVivos = personajesVivos;
        this.personajesMuertos = personajesMuertos;
    }
     public Batalla() {
        this.personajesVivos = new ArrayList();
        this.personajesMuertos = new ArrayList();
    }
     
    //Metodos
    public void posicionarPjes(){}
    public void ordenarTurnos(){}
    public void efectuarTurnos(){}
    public void eliminarPersonaje(){}
    
}
