/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Aula11;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 20/03/2024
@brief Class Bus
public class Bus 
*/ 
public class Bus extends Vehicle {

    public int seats;
    
    public Bus(String plate, int year, int seats) {
        super(plate, year);
        this.seats = seats;
    }
    
    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
    
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Assentos: " + seats);
    }
}

