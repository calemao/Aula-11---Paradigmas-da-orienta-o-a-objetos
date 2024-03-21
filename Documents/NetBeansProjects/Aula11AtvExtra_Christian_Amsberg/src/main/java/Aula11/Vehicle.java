/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Aula11;

/**
 *
 * @author Christian Amsberg Janner <janner.chris15@outlook.com>
@date 20/03/2024
@brief Class Vehicle
public class Vehicle
*/ 
public class Vehicle {

    private String plate;
    private int year;
    
    public Vehicle() {
        this.plate = "";
        this.year = 0;
    }
    
    public Vehicle(String plate, int year) {
        this.plate = plate;
        this.year = year;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setYear(String year) {
        this.year = Integer.parseInt(year);
    }
    
    public String getPlate() {
        return plate;
    }
    
    public int getYear() {
        return year;
    }
    
    public void displayData() {
        System.out.println("Placa: " + plate);
        System.out.println("Ano: " + year);
    }
}
