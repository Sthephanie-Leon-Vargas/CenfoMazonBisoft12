/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cenfomazon.Comportamiento.Observador.Interface;

/**
 *
 * @author User
 */
public interface Subjeto {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
