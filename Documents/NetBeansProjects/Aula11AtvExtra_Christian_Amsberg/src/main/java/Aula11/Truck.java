/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Aula11;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 20/03/2024
@brief Class Truck
public class Truck 
* **/
public class Truck extends Vehicle {

    public int axles;
    
    public Truck(String plate, int year, int axles) {
        super(plate, year);
        this.axles = axles;
    }
    
    public void setAxles(int axles) {
        this.axles = axles;
    }
    
    public int getAxles() {
        return axles;
    }
    
    @Override 
    public void displayData() {
        super.displayData();
        System.out.println("Eixos: " + axles);
    }
}

