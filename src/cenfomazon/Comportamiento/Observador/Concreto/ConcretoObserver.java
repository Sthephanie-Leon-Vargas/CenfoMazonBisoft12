/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Comportamiento.Observador.Concreto;

import cenfomazon.Comportamiento.Observador.Interface.Observer;

/**
 *
 * @author User
 */
public class ConcretoObserver implements Observer {
    private String observerNombre;
    private ConcretoSubjeto subjeto;
    
    public ConcretoObserver(String observerNombre, ConcretoSubjeto subjeto) {
        this.observerNombre = observerNombre;
        this.subjeto = subjeto;
        subjeto.addObserver(this);
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
