package controllers;

import java.util.*;

import models.Maquina;

public class MaquinaController {
    
    public MaquinaController(){

    }

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquina,int umbral){
        Stack<Maquina> actual = new Stack<>();
        for (Maquina m : maquina) {
            if(m.getSubred()>umbral){
                actual.add(m);
            }
        }
        return actual;
    }
     
    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila){
        
        Set<Maquina> actual = new TreeSet<>();
        for (Maquina m : pila) {
            actual.add(m);
        }
        return actual;

    }

    public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquina){
        Set<Maquina> actual = new TreeSet<>();
        for (Maquina m : maquina) {
            actual.add(m);
        }
        return actual;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>>){
        Stack<Maquina> nuevo = new Stack<>();
        return nuevo;
    }
}
