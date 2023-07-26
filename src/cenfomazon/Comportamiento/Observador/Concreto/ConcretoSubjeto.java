/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Comportamiento.Observador.Concreto;

import cenfomazon.Comportamiento.Observador.Interface.Observer;
import cenfomazon.Comportamiento.Observador.Interface.Subjeto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ConcretoSubjeto implements Subjeto{
    private List<Observer> observadores = new ArrayList<>();
    private String estado;
    
    public void setEstado(String estado) {
        this.estado = estado;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observadores) {
            observer.update();
        }
    }
}
